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
                    "3. Question 3 - Restaurant Meal  Task \n",
                    "4. Question 4 - House & Investment  Task \n",
                    "5. Question 5 - Date Task \n",
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
                case 3:
                    A2.Question3();
                    break;
                case 4:
                    A2.Question4();
                    break;
                case 5:
                    A2.Question5();
                    break;

                default:
                    AppHelper.MyPrint("Invalid choice. Please enter a number between 1 and 6.");
            }

        } while (choice != 6);

    }
}
