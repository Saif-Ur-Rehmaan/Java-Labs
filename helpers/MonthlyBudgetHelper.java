package helpers;
import models.MonthlyBudget;

public class MonthlyBudgetHelper{

    public void generateReport(MonthlyBudget... budgets){
        System.out.println("========================================");
        System.out.println("        Monthly Budget Report");
        System.out.println("========================================");
        System.out.printf("%-20s %-10s %-10s %-10s%n", "Category", "Planned", "Actual", "Over/Under");
        
    }
    
     

}