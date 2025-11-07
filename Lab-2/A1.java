import helpers.AppHelper;
import helpers.CropDataHelper;
import helpers.MonthlyBudgetHelper;
import models.CorpData;
import models.MovieData;
import models.MonthlyBudget;
import models.Date;
import enums.DateFormat;

public class A1 {
    public static void Question1() {
        MovieData movie1 = new MovieData();
        movie1.set("Movie 1", "Director 1", 18888, 1111, 50000, 1000000);
        movie1.show();
        MovieData movie2 = new MovieData();
        movie2.set("Movie 2", "Director 2", 1578, 110, 5200000, 10000);
        movie2.show();
    }

    public static void Question2() {
        CorpData CDataEast = new CorpData("East", 220, 20, 40, 60);
        CorpData CDataWest = new CorpData("West", 10, 20, 2, 40);
        CorpData CDataNorth = new CorpData("North", 230, 43520, 32420, 4320);
        CorpData CDataSouth = new CorpData("South", 330, 440, 550, 2340);

        // calculate totlas of all divisions...
        // Explaination:
        // this function will update the original instnce seperately
        // after running this function the "totalAnnualSales" data member
        // inside each CDataEast,west,north,south will contain the calculated total
        // annual value
        CropDataHelper.calculateDivisionsTotals(CDataEast, CDataWest, CDataNorth, CDataSouth);
        // calculate average...
        // Explaination:
        // this function will update the original instnce seperately
        // after running this function the "averageQuarterlySales" data member
        // inside each CDataEast,west,north,south will contain the calculated total avg
        // value
        CropDataHelper.calculateDivisionsTotals(CDataEast, CDataWest, CDataNorth, CDataSouth);

        // calculate average...
        // after running this func every divisions data wil be displayed seperately
        CropDataHelper.displayDivisionsData(CDataEast, CDataWest, CDataNorth, CDataSouth);

    }

    public static void Question3() {
        // fixed ...
        MonthlyBudget goalBudget = new MonthlyBudget(500.00, 150.00, 65.00, 50.00, 250.00, 30.00, 100.00, 150.00, 75.00,
                50.00);
        // User defined
        MonthlyBudget actual = new MonthlyBudget(0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        int housing = AppHelper.inputInt("Please Enter housing amount: "),
                utilities = AppHelper.inputInt("Please Enter utilities amount: "),
                householdExpenses = AppHelper.inputInt("Please Enter householdExpenses amount: "),
                transportation = AppHelper.inputInt("Please Enter transportation amount: "),
                food = AppHelper.inputInt("Please Enter food amount: "),
                medical = AppHelper.inputInt("Please Enter medical amount: "),
                insurance = AppHelper.inputInt("Please Enter insurance amount: "),
                entertainment = AppHelper.inputInt("Please Enter entertainment amount: "),
                clothing = AppHelper.inputInt("Please Enter clothing amount: "),
                miscellaneous = AppHelper.inputInt("Please Enter miscellaneous amount: ");
        // initilizing 2nd object
        actual.set(housing, utilities, householdExpenses, transportation, food, medical, insurance, entertainment,
                clothing, miscellaneous);
        // generating report
        MonthlyBudgetHelper.generateReport(goalBudget, actual);
    }

    public static void Question4() {
        Date d1 = new Date();
        AppHelper.MyPrint("=== DATE Object (no args constructor) ===");
        d1.printDate(DateFormat.LONG_DATE);
        d1.printDate(DateFormat.SHORT_DATE);
        d1.printDate(DateFormat.INTERNATIONAL);

        AppHelper.MyPrint("\n=== DATE Object (with args constructor) ===");
        Date d2 = new Date();
        boolean isvalid = false;
        do {

            int m = AppHelper.inputInt("Please Enter Month: "), d = AppHelper.inputInt("Please Enter Day: "),
                    y = AppHelper.inputInt("Please Enter Year: ");
            boolean isValidationPassed = d2.set(m, d, y);
            isvalid = isValidationPassed;

        } while (!isvalid);
        d2.printDate(DateFormat.LONG_DATE);
        d2.printDate(DateFormat.SHORT_DATE);
        d2.printDate(DateFormat.INTERNATIONAL);
    }
}
