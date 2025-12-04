package base;

import helpers.AppHelper;

public class Date {
    private int month;
    private int day;
    private int year;

    public void setDate(int m, int d, int y) {
        setMonth(m > 12 ? 12 : m);
        setDay(d > 31 ? 31 : d);
        setYear(y);
    }

    public void showDate() {
        AppHelper.MyPrint("Date is: ", String.valueOf(month), "/", String.valueOf(day), "/", String.valueOf(year));
    }

    private void setDay(int day) {
        this.day = day;
    }

    private void setMonth(int month) {
        this.month = month;
    }

    private void setYear(int year) {
        this.year = year;
    }

    public void increaseDay() {
        if (day > 30) {
            setDay(1);
            if (month == 11) {
                setMonth(1);
                setYear(year + 1);

            } else {
                setMonth(month + 1);
            }
        } else {
            setDay(day + 1);
        }
    }
}
