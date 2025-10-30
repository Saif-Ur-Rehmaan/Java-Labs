import helpers.CropDataHelper;
import models.CorpData;
import models.MovieData;

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
        CorpData CDataEast = new CorpData("East", 220, 20, 40,60);
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

}
