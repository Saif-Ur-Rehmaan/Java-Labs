package Lab05;

import java.util.ArrayList;

import helpers.AppHelper;

public class Customer {
    private String name;
    private String email;
    private ArrayList<Double> purchaseHistory;

    public Customer(String name, String email) {
        purchaseHistory = new ArrayList<Double>();
    }

    public void addPurchase(double amount) {
        if (amount > 0)
            purchaseHistory.add(amount);
    }

    public double calculateTotalExpenditure(){
        double total = 0;
        for (double history : purchaseHistory) {
            total += history;
        }
        return total;
    }

    public void displayCustomerInfo() {
        AppHelper.MyPrint("Name: ", name);
        AppHelper.MyPrint("email: ", email);
        AppHelper.MyPrint("Total Expenditure: ", String.valueOf(calculateTotalExpenditure()));
    }
}
