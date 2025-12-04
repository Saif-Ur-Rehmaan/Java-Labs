package Lab03;

import base.BankAccount;
import base.Date;
import helpers.AppHelper;
import models.Fiction;
import models.HouseThatIsAnInvestment;
import models.NationalAnthem;
import models.NonFiction;
import models.RoomServiceMeal;

public class A2 {

    public static void Question1() {
        NationalAnthem anthem = new NationalAnthem(
                "Pakistan",
                "Qaumi Tarana",
                "Hafeez Jalandhari",
                1952);
        anthem.printInfo();
    }

    public static void Question2() {
        Fiction fictionBook = new Fiction("The Hobbit", "J.R.R. Tolkien", "Fantasy");
        NonFiction nonFictionBook = new NonFiction("Sapiens", "Yuval Noah Harari", 498);

        // Print their details
        AppHelper.MyPrint("=== Fiction Book ===");
        fictionBook.printInfo();

        AppHelper.MyPrint("\n=== Non-Fiction Book ===");
        nonFictionBook.printInfo();
    }

    public static void Question3() {

        RoomServiceMeal r = new RoomServiceMeal("Steak Dinner", 1999, 1202);
        r.displayRoomServiceMeal();
    }

    public static void Question4() {
        HouseThatIsAnInvestment house = new HouseThatIsAnInvestment(1000000, 500000, "Abc Street Karachi", "13x20");
        house.display();
    }

    public static void Question5() {

        // === Requirement A: instantiate several dates and show them ===
        System.out.println("=== Requirement A Tests ===");

        Date d1 = new Date();
        d1.setDate(50, 20, 5151); // month > 12 becomes 12
        d1.showDate();

        Date d2 = new Date();
        d2.setDate(5, 40, 2023); // day > 31 becomes 31
        d2.showDate();

        Date d3 = new Date();
        d3.setDate(10, 15, 2000);
        d3.showDate();

        // === Requirement B: test increaseDay() near end of month ===
        System.out.println("\n=== Requirement B Tests (5 increments each) ===");

        Date closeToEnd1 = new Date();
        closeToEnd1.setDate(7, 30, 2024); // day 30 → 31 → rollover
        testIncreaseFiveTimes(closeToEnd1);

        Date closeToEnd2 = new Date();
        closeToEnd2.setDate(11, 31, 1999); // edge case
        testIncreaseFiveTimes(closeToEnd2);

        // === Requirement C: rollover month AND year ===
        System.out.println("\n=== Requirement C Test (12/29/2016 → 12/33/2016 → 1/1/2017) ===");

        Date endOfYear = new Date();
        endOfYear.setDate(12, 29, 2016);

        for (int i = 0; i < 4; i++) {
            endOfYear.increaseDay();
            endOfYear.showDate();
        }
    }

    public static void testIncreaseFiveTimes(Date d) {
        System.out.println("Starting test for:");
        d.showDate();
        for (int i = 0; i < 5; i++) {
            d.increaseDay();
            d.showDate();
        }
    }

    public static void Question6() { 
 
        BankAccount acc1 = new BankAccount();
        System.out.println("Enter data for Account 1:");
        acc1.enterAccountData();
        acc1.displayAccount();
        acc1.computeInterest(3); // 3 years of interest
 
        BankAccount acc2 = new BankAccount();
        System.out.println("Enter data for Account 2:");
        acc2.enterAccountData();
        acc2.displayAccount();
        acc2.computeInterest(5); // 5 years of interest
 
        BankAccount acc3 = new BankAccount();
        System.out.println("Enter data for Account 3:");
        acc3.enterAccountData();
        acc3.displayAccount();
        acc3.computeInterest(2); // 2 years of interest

        System.out.println("===== End of Question 6 Testing =====");
    }

}