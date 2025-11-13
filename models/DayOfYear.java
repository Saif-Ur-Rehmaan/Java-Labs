package models;

import helpers.AppHelper;

public class DayOfYear {
    String date;

    public DayOfYear(int dayOfYear) {
        int day = dayOfYear;
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String[] monthNames = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

        int monthIndex = 0;
        int totalDays = 0;

        while (day > totalDays + daysInMonth[monthIndex]) {
            totalDays += daysInMonth[monthIndex];
            monthIndex++;
        }

        int dayOfMonth = day - totalDays;
        date = "Day " + day + " = " + monthNames[monthIndex] + " " + dayOfMonth;
    }

    public void printDate() {
        AppHelper.MyPrint(date);
    }
}
