package models;

import base.Investment;
import helpers.AppHelper;

public class House extends Investment {
    private String streetAddress;
    private String squareft;

    public House(double _currentValue, double _initialValue, String _streetAddress, String _sqft) {
        super(_currentValue, _initialValue);
        setStreetAddress(_streetAddress);
        setSquareft(_sqft);
    }

    public void setSquareft(String squareft) {
        this.squareft = squareft;
    }

    public String getSquareft() {
        return squareft;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void display() {
        super.display();
        AppHelper.MyPrint("Street Address: ", streetAddress);
        AppHelper.MyPrint("square feet: ", String.valueOf(squareft));
    }
}
