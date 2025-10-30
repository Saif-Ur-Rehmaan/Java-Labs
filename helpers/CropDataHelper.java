package helpers;

import models.CorpData;

public class CropDataHelper {
    public static void calculateDivisionsTotals(CorpData... divisions) {
        AppHelper.MyPrint("\nTask: ", "Calculating Annual Total");
        for (CorpData corpData : divisions) {
            corpData.calculateTotalAnnual();
        }
    }

    public static void calculateDivisionsAverage(CorpData... divisions) {
        AppHelper.MyPrint("\nTask: ", "Calculating Average");
        for (CorpData corpData : divisions) {
            corpData.calculateAverage();
        }
    }

    public static void displayDivisionsData(CorpData... divisions) {
        AppHelper.MyPrint("\n==================", "Displaying Data", "==================");
        for (CorpData corpData : divisions) {
            AppHelper.MyPrint("\n For: ", corpData.getDivisionName());
            corpData.displayData();
        }
    }
}
