package Lab05;

import java.util.ArrayList;
import java.util.List;

import helpers.AppHelper;

public class BankAccount {
    private String accountName;
    private String accountHolder;
    private double balance;
    private ArrayList<String> transactionHistory;

    public BankAccount() {
        transactionHistory = new ArrayList<String>();
        balance = 0;
    }

    public void deposit(double amount) {
        String a = "+$" + amount;
        transactionHistory.add(a);
        AppHelper.MyPrint("Successfully Deposited: " + a);
    }

    public void withdraw(double amount) {
        double diff = balance - amount;
        if (diff < 0) {
            AppHelper.MyPrint("Invalid Amount: ");
        }
        String a = "-$" + amount;
        transactionHistory.add(a);
        AppHelper.MyPrint("Successfully Deposited: " + a);
    }

}
