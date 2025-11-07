package helpers;

import java.lang.reflect.Field;

import models.MonthlyBudget;

public class MonthlyBudgetHelper {

    public static void generateReport(MonthlyBudget goal, MonthlyBudget actual) {
        System.out.println("========================================");
        System.out.println("        Monthly Budget Report");
        System.out.println("========================================");
        System.out.printf("%-20s %-10s %-10s %-10s%n", "Category", "Planned", "Actual", "Over/Under");
        String[] dataMembers = { "housing", "utilities", "householdExpenses", "transportation", "food", "medical",
        "insurance", "entertainment", "clothing", "miscellaneous" };
        for (String dmember : dataMembers) {
            try {
                // its dynamically accessing data members .
                // on 1st loop goalVal will contain value of goal.housing
                // on 2nd loop goalVal will contain value of goal.utilities
                // and it goes till loop ends.. same goes for actVal
                Field goalField = goal.getClass().getDeclaredField(dmember);
                double goalVal = (double) goalField.get(goal);
                Field actField = actual.getClass().getDeclaredField(dmember);
                double actVal = (double) actField.get(actual);
                
                // calculating difference
                double difference = goalVal - actVal;
                
                String budgetState = difference == 0 ? "Exact Budget"
                : difference > 0 ? "out of budget" : "under budget";
                
                System.out.printf("%-20s %-10s %-10s %-10s%n", dmember, String.valueOf(goalVal), String.valueOf(actVal), budgetState);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}