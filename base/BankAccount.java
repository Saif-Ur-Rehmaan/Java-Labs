package base;

import helpers.AppHelper;

public class BankAccount {

    private int accountNumber;
    private double balance;

    private static final double INTEREST_RATE = 0.03;

    public void enterAccountData() {

        while (true) {
            int num = AppHelper.inputInt("Enter account number (>= 1000): ");

            if (num >= 1000) {
                accountNumber = num;
                break;
            } else {
                AppHelper.MyPrint("Invalid! Account number must be >= 1000.");
            }
        }

        while (true) {
            double bal = AppHelper.inputDouble("Enter account balance (>= 0): ");

            if (bal >= 0) {
                balance = bal;
                break;
            } else {
                AppHelper.MyPrint("Invalid! Balance cannot be negative.");
            }
        }

        AppHelper.MyPrint("Account data successfully entered.\n");
    }

    public void computeInterest(int years) {
        AppHelper.MyPrint("=== Interest Computation for Account " + accountNumber + " ===");
        double currentBalance = balance;

        for (int year = 1; year <= years; year++) {
            currentBalance += currentBalance * INTEREST_RATE;
            System.out.printf("Ending balance for year %d: %.2f\n", year, currentBalance);
        }

        System.out.println();
    }

    public void displayAccount() {
        AppHelper.MyPrint("=== Account Details ===");
        AppHelper.MyPrint("Account Number: " + accountNumber);
        System.out.printf("Balance: %.2f\n", balance);
        AppHelper.MyPrint("Interest Rate: " + (INTEREST_RATE * 100) + "%");
    }
}
