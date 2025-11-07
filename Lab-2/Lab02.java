import helpers.AppHelper;
import models.Body;
import models.Brain;
import models.Men;
import models.MovieData;

public class Lab02 {
    public static void main(String[] args) {
        int choice;
        do {
            AppHelper.MyPrint(
                    "\n*********** Main Menu ***********\n",
                    "1. In Class Practice Task \n",
                    "2. Question 1 - Movie data Task \n",
                    "3. Question 2 - Crop Data Task \n",
                    "4. Question 3 - Monthly Budget Task \n",
                    "6. Exit\n",
                    "*********************************\n");

            choice = AppHelper.inputInt("Enter your choice (1-6): ");

            switch (choice) {
                case 1:
                    inClassTask();
                    break;
                case 2:
                    A1.Question1();
                    break;
                case 3:
                    A1.Question2();
                    break;
                case 4:
                    A1.Question3();
                    break;
                default:
                    AppHelper.MyPrint("Invalid choice. Please enter a number between 1 and 6.");
            }

        } while (choice != 6);

    }

    public static void inClassTask() {
        Brain ubaid_brain = new Brain();
        Body ubaid_body = new Body();
        Men ubaid = new Men(ubaid_brain, ubaid_body);

        ubaid.enableSound();
        ubaid.tellMeAboutYourSelf();
        ubaid.talk();
        ubaid.eat("pizza");

    }

}
