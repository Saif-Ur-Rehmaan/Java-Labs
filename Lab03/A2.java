package Lab03;

import helpers.AppHelper;
import models.Fiction;
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

}