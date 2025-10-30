package models;

import helpers.AppHelper;

public class MovieData {
    public String Title, Director;
    public int YearReleased, Runningtime, productionCosts, firstYearRevenues;

    public void set(String title, String director, int yearReleased, int runningtime, int productionCosts,
            int firstYearRevenues) {
        this.Title = title;
        this.Director = director;
        this.YearReleased = yearReleased;
        this.Runningtime = runningtime;
        this.productionCosts = productionCosts;
        this.firstYearRevenues = firstYearRevenues;
    }

    public void show() {
        AppHelper.MyPrint("Title: " + Title);
        AppHelper.MyPrint("Director: " + Director);
        AppHelper.MyPrint("Year Released: " + YearReleased);
        AppHelper.MyPrint("Running Time: " + Runningtime + " minutes");
        AppHelper.MyPrint("Production Cost: " + productionCosts);
        AppHelper.MyPrint("First year Revinue: " + firstYearRevenues);

        if (firstYearRevenues > productionCosts) {
            AppHelper.MyPrint("Profit: " + String.valueOf(firstYearRevenues - productionCosts));
        } else {
            AppHelper.MyPrint("Loss: " + String.valueOf(productionCosts - firstYearRevenues));
        }
    }

}