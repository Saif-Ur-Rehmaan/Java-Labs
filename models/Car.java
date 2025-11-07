package models;

import helpers.AppHelper;

public class Car {
    private int year;
    private String make;
    private int speed;

    public Car(int y, String m) {
        year = y;
        make = m;
        speed = 0;
    }

    public String getMake() {
        return make;
    }

    public int getSpeed() {
        return speed;
    }

    public int getYear() {
        return year;
    }

    public void accelerate() {
        AppHelper.MyPrint("\n Accelerating... (increasing speed)");
        for (int i = 1; i <= 5; i++) {
            speed += i;
            AppHelper.MyPrint(String.format("  Step %d => Current Speed: %d km/h", i, speed));
        }
        AppHelper.MyPrint(String.format("--= Final Speed after acceleration: %d km/h", speed));
    }
    
    public void brake() {
        AppHelper.MyPrint("\n Braking... (decreasing speed)");
        for (int i = 1; i <= 5; i++) {
            speed -= i;
            if (speed < 0) speed = 0; // Prevent negative speed
            AppHelper.MyPrint(String.format("  Step %d => Current Speed: %d km/h", i, speed));
        }
        AppHelper.MyPrint(String.format("--= Final Speed after braking: %d km/h", speed));
    }
    
}
