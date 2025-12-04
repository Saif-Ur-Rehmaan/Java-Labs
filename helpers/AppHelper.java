package helpers;

import java.util.Random;
import java.util.Scanner;

public class AppHelper {

    public static Scanner instance = new Scanner(System.in);
    public static Random random = new Random();

    public static void MyPrint(String... args) {

        String message = "";
        for (String a : args) {
            message += a;
        }
        System.out.println(message);
    }

    public static int inputInt(String message) {
        System.out.print(message);
        return instance.nextInt();
    }

    public static double inputDouble(String message) {
        System.out.print(message);
        return instance.nextDouble();
    }

    public static Scanner getInstance() {
        return instance;
    }

}
