package models;

import enums.DateFormat;
import helpers.AppHelper;

public class Date {
    int month = 1, day = 1, year = 2001;

    public Date(int m, int d, int y) {
        if (!validate(m, d, y))
            return;
        month = m;
        day = d;
        year = y;
    }

    public Date() {
        month = 1;
        day = 1;
        year = 2025;
    }

    private boolean validate(int m, int d, int y) {

        if (d < 1 || d > 31 || m < 1 || m > 12 || y < 1950 || y > 2020) {
            AppHelper.MyPrint("****************************************************");
            AppHelper.MyPrint("***************Validation Error Occured*************");
            AppHelper.MyPrint("****************************************************");
            AppHelper.MyPrint("\n Please enter Day between 1-31 ",
                    "\n Please enter month between 1-12 ", "\n Please enter year between 1950-2020");
            AppHelper.MyPrint("****************************************************");
            return false;
        }
        return true;
    }

    public boolean set(int m, int d, int y) {
        if (!validate(m, d, y))
            return false;
        month = m;
        day = d;
        year = y;
        return true;
    }

    private String getMonthName(int monthInInt) {
        String[] months = { "January", "Febuary", "March", "Aprail", "May", "June", "July", "Augest", "September",
                "Octuber", "November", "December" };
        return months[monthInInt - 1];
    }

    public void printDate(DateFormat format) {
        switch (format) {
            case SHORT_DATE:
                System.out.printf("%d/%d/%d%n", month, day, year);
                break;
            case LONG_DATE:
                System.out.printf("%s %d, %d%n", getMonthName(month), day, year);
                break;
            case INTERNATIONAL:
                System.out.printf("%d %s %d%n", day, getMonthName(month), year);
                break;

            default:
                break;
        }
    }

}
