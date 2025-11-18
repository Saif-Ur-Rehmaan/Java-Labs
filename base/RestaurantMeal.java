package base;

import helpers.AppHelper;

public class RestaurantMeal {
    private String name;
    private int price;

    public RestaurantMeal(String _name, int _price) {
        setName(_name);
        setPrice(_price);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void displayMeal() {
        AppHelper.MyPrint("Food Name: " + name);
        AppHelper.MyPrint("Food Price: Rs. " + price);
    }

}
