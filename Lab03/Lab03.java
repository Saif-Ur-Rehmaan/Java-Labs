package Lab03;

import helpers.AppHelper;

public class Lab03 {
    public static void main(String[] args) {

        int choice;
        do {
            AppHelper.MyPrint(
                    "\n*********** Main Menu ***********\n",
                    "1. Question 1 - Musical composition Task \n",
                    "2. Question 2 - Book Task \n",
                    "8. Exit\n",
                    "*********************************\n");

            choice = AppHelper.inputInt("Enter your choice (1-6): ");

            switch (choice) {
                case 1:
                    A2.Question1();
                    break;
                case 2:
                    A2.Question2();
                    break;

                default:
                    AppHelper.MyPrint("Invalid choice. Please enter a number between 1 and 6.");
            }

        } while (choice != 6);

    }
}
