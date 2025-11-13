import helpers.AppHelper;

public class lab3 {
    public static void main(String[] args) {

        int choice;
        do {
            AppHelper.MyPrint(
                    "\n*********** Main Menu ***********\n",
                    "1. Question 1 - musical composition Task \n",
                    "2. Question 2 - Crop Data Task \n",
                    "3. Question 3 - Monthly Budget Task \n",
                    "4. Question 4 - Date Task \n",
                    "5. Question 5 - Car Task \n",
                    "6. Question 6 - Population Task \n",
                    "7. Question 7 - Print Date Task \n",
                    "8. Exit\n",
                    "*********************************\n");

            choice = AppHelper.inputInt("Enter your choice (1-6): ");

            switch (choice) {
                case 1:
                    break;

                default:
                    AppHelper.MyPrint("Invalid choice. Please enter a number between 1 and 6.");
            }

        } while (choice != 6);

    }
}
