package base;

import java.util.Random;
import java.util.Scanner;

public abstract class AbstructClass {

    public static Scanner instance = new Scanner(System.in);
    public static Random random = new Random();
 
    public void print(String... args) {

        String message = "";
        for (String a : args) {
            message += a;
        }
        System.out.println(message);
    }

}
