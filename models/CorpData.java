package models;

public class CorpData {
    private String divisionName;
    private double firstQuarterSales,
            secondQuarterSales,
            thirdQuarterSales,
            fourthQuarterSales,
            totalAnnualSales,
            averageQuarterlySales;

    public CorpData(String name, double q1, double q2, double q3, double q4) {
        divisionName = name;
        firstQuarterSales = q1;
        secondQuarterSales = q2;
        thirdQuarterSales = q3;
        fourthQuarterSales = q4;

    }

    public void calculateTotalAnnual() {
        totalAnnualSales = firstQuarterSales + secondQuarterSales + thirdQuarterSales + fourthQuarterSales;
    }

    public void calculateAverage() {
        averageQuarterlySales = ((firstQuarterSales + secondQuarterSales + thirdQuarterSales + fourthQuarterSales) / 4);
    }

    public String getDivisionName() {
        return this.divisionName;
    }

    public void displayData() {
        System.out.println("Division: " + divisionName);
        System.out.printf("Q1 Sales: $%,.2f%n", firstQuarterSales);
        System.out.printf("Q2 Sales: $%,.2f%n", secondQuarterSales);
        System.out.printf("Q3 Sales: $%,.2f%n", thirdQuarterSales);
        System.out.printf("Q4 Sales: $%,.2f%n", fourthQuarterSales);
        System.out.printf("Total Annual Sales: $%,.2f%n", totalAnnualSales);
        System.out.printf("Average Quarterly Sales: $%,.2f%n", averageQuarterlySales);
    }
}
