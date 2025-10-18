import java.util.Random;
import java.util.Scanner;

public class Lab01 {
    public static Scanner instance = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        int choice;
        do {
            MyPrint(
                    "\n*********** Main Menu ***********\n",
                    "1. Number Analyzer\n",
                    "2. Multiplication Table Generator\n",
                    "3. Array Search\n",
                    "4. Grade Calculator\n",
                    "5. Array Operations Menu\n",
                    "6. Exit\n",
                    "*********************************\n");

            choice = inputInt("Enter your choice (1-6): ", instance);

            switch (choice) {
                case 1:
                    numberAnalyzer();
                    break;
                case 2:
                    multiplicationTableGenerator();
                    break;
                case 3:
                    arraySearch();
                    break;
                case 4:
                    gradeCalculator();
                    break;
                case 5:
                    arrayOperationsMenu();
                    break;
                case 6:
                    MyPrint("Exiting program. Goodbye!");
                    break;
                default:
                    MyPrint("Invalid choice. Please enter a number between 1 and 6.");
            }

        } while (choice != 6);

        instance.close();
    }

    public static void numberAnalyzer() {
        MyPrint("*******************************************", "\nNumber Analyzer\n",
                "*******************************************");
        int[] inputs = { 0, 0, 0, 0, 0 };
        int TotalNeg = 0;
        int TotalPos = 0;
        int TotalEven = 0;
        int TotalOdd = 0;
        for (int i = 0; i < 5; i++) {
            inputs[i] = inputInt(String.valueOf(i) + ") Enter Number ", instance);
        }
        MyPrint("\n------------------ Result--------------\n");
        for (int i : inputs) {
            String message = " input Number " + String.valueOf(i) + "is ";
            if (i < 0) {
                message += "Negative";
                TotalNeg += 1;
            }
            if (i > 0) {
                message += "Positive";
                TotalPos += 1;
            }
            if (i % 2 == 0) {
                message += " And Even";
                TotalEven += 1;
            } else {
                message += " And odd";
                TotalOdd += 1;
            }

            if (i == 0) {
                message += "Neither negative nor positive";
            }
            MyPrint(message);
        }
        MyPrint("Total Negative ", String.valueOf(TotalNeg), "\nTotal Positive ", String.valueOf(TotalPos),
                "\nTotal Even ", String.valueOf(TotalEven), "\nTotal Odd ", String.valueOf(TotalOdd));
    }

    public static void multiplicationTableGenerator() {

        MyPrint("*******************************************", "\nMultiplication Table Generator\n",
                "*******************************************");
        for (int i = 1; i <= 10; i++) {
            MyPrint("*******************************************", "*******************************************",
                    "\nTable of ", String.valueOf(i));
            for (int j = 1; j <= 10; j++) {
                MyPrint(String.valueOf(i), " x ", String.valueOf(j), " = ", String.valueOf(i * j));
            }
            MyPrint("*******************************************", "\n*******************************************");
        }

    }

    public static void arraySearch() {
        MyPrint("*******************************************", "\nArray Search\n",
                "*******************************************");
        int[] randomNumbers = { 100, 2, 3, 400, 5, 6, 7, 8, 9, 3 };

        int userInput = inputInt("\nEnter Any Number to check that existance in random array: ", instance);
        int max = 0;
        int min = 0;
        int sum = 0;
        int avg = 0;

        boolean indexOfFound = false;
        String positions = "";
        for (int i = 0; i < randomNumbers.length; i++) {
            int num = randomNumbers[i];
            max = num > max ? num : max;
            min = i == 0 ? randomNumbers[i] : num < min ? num : min;
            sum += num;
            if (num == userInput) {
                indexOfFound = true;
                positions += String.valueOf(i);
            }
        }
        avg = sum / (randomNumbers.length == 0 ? 1 : randomNumbers.length);
        MyPrint("Max: ", String.valueOf(max), "\nMin: ", String.valueOf(min), "\n Avg: ", String.valueOf(avg),
                !indexOfFound ? "\nUser Input: " + String.valueOf(userInput) + " Isnt found in random array"
                        : "\nUser Input: " + String.valueOf(userInput) + "  found in random array At index(s)"
                                + positions);
    }

    public static void gradeCalculator() {
        MyPrint("*******************************************", "\nArray Search\n",
                "*******************************************");
        boolean continueRunning = true;
        while (continueRunning) {

            String[] subjects = { "Engilsh", "Maths", "Physics", "Computer", "Urdu" };
            int[] total = { 550, 550, 550, 550, 550 };
            int[] obtain = { 0, 0, 0, 0, 0 };
            for (int i = 0; i < subjects.length; i++) {
                String subject = subjects[i];
                int totalOfSub = total[i];
                obtain[i] = inputInt("Enter Obtain Marks for " + subject + " out of " + totalOfSub + ": ", instance);
            }
            int totalOfAll = 0;
            int totalObtainOfAll = 0;
            for (int t : total) {
                totalOfAll += t;
            }
            for (int o : obtain) {
                totalObtainOfAll += o;
            }
            float percentage = totalOfAll / totalObtainOfAll;
            String grade = "";
            if (percentage > 90) {
                grade = "A";
            } else if (percentage > 75 && percentage < 89) {
                grade = "B";
            } else if (percentage >= 50 && percentage < 74) {
                grade = "C";
            } else {
                grade = "F";

            }
            MyPrint("Total Marks : ", String.valueOf(totalOfAll), "\nTotal obtain : ", String.valueOf(totalObtainOfAll),
                    "\nGrade: ", grade);

            MyPrint("\nDo you want to calculate grades again? (yes/no): ");
            String userResponse = instance.nextLine().trim().toLowerCase();
            if (userResponse.equals("no") || userResponse.equals("n")) {
                continueRunning = false;
            }
        }
    }

    public static void arrayOperationsMenu() {
        int[] array = null;
        int choice;

        do {
            MyPrint(
                    "\n*********** Array Operations Menu ***********\n",
                    "1. Input array elements\n",
                    "2. Display array\n",
                    "3. Reverse the array\n",
                    "4. Find sum of all elements\n",
                    "5. Find largest and smallest element\n",
                    "6. Exit\n",
                    "*********************************************");

            choice = inputInt("Enter your choice (1-6): ", instance);

            switch (choice) {
                case 1:
                    int size = inputInt("Enter the size of the array: ", instance);
                    array = new int[size];
                    for (int i = 0; i < size; i++) {
                        array[i] = inputInt("Enter element " + (i + 1) + ": ", instance);
                    }
                    MyPrint("Array elements input successfully.\n");
                    break;

                case 2:
                    if (array == null) {
                        MyPrint("Array is not initialized. Please input elements first.\n");
                    } else {
                        MyPrint("Array elements: ");
                        for (int num : array) {
                            System.out.print(num + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    if (array == null) {
                        MyPrint("Array is not initialized. Please input elements first.\n");
                    } else {
                        MyPrint("Reversed array: ");
                        for (int i = array.length - 1; i >= 0; i--) {
                            System.out.print(array[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    if (array == null) {
                        MyPrint("Array is not initialized. Please input elements first.\n");
                    } else {
                        int sum = 0;
                        for (int num : array) {
                            sum += num;
                        }
                        MyPrint("Sum of all elements: ", String.valueOf(sum), "\n");
                    }
                    break;

                case 5:
                    if (array == null) {
                        MyPrint("Array is not initialized. Please input elements first.\n");
                    } else {
                        int max = array[0];
                        int min = array[0];
                        for (int num : array) {
                            if (num > max)
                                max = num;
                            if (num < min)
                                min = num;
                        }
                        MyPrint("Largest element: ", String.valueOf(max), "\n",
                                "Smallest element: ", String.valueOf(min), "\n");
                    }
                    break;

                case 6:
                    MyPrint("Exiting the program. Goodbye!\n");
                    break;

                default:
                    MyPrint("Invalid choice. Please select between 1 to 6.\n");
            }

        } while (choice != 6);
    }

    public static void MyPrint(String... args) {

        String message = "";
        for (String a : args) {
            message += a;
        }
        System.out.println(message);
    }

    public static int inputInt(String message, Scanner instance) {
        System.out.print(message);
        return instance.nextInt();
    }

    public static int add(int a, int b) {
        return a + b;
    }

}