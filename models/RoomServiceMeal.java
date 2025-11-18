package models;

import base.HotelService;
import base.RestaurantMeal;

public class RoomServiceMeal extends HotelService {

    private RestaurantMeal meal;
 
    public RoomServiceMeal(String mealName, int mealPrice, int roomNo) {
        super("room service", 400, roomNo); 
        this.meal = new RestaurantMeal(mealName, mealPrice);
    }

    public void displayRoomServiceMeal() {
        System.out.println("----- Room Service Meal Details -----");

        meal.displayMeal();

        super.displayService();

        int total = meal.getPrice() + (int) this.getFee();

        System.out.println("Total Bill: Rs. " + total);
    }
}
