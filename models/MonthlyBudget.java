package models;

import base.AbstructClass;

public class MonthlyBudget extends AbstructClass {
    public double housing,
        utilities,
        householdExpenses,
        transportation,
        food,
        medical,
        insurance,
        entertainment,
        clothing,
        miscellaneous;

    public  MonthlyBudget(double _housing,double _utilities,double _householdExpenses,double _transportation,double _food,double _medical,double _insurance,double _entertainment,double _clothing,double _miscellaneous ){

        set( _housing, _utilities, _householdExpenses, _transportation, _food, _medical, _insurance, _entertainment, _clothing, _miscellaneous );

    }
    public void  set( double _housing,double _utilities,double _householdExpenses,double _transportation,double _food,double _medical,double _insurance,double _entertainment,double _clothing,double _miscellaneous ){

        housing = _housing;
        utilities = _utilities;
        householdExpenses = _householdExpenses;
        transportation = _transportation;
        food = _food;
        medical = _medical;
        insurance = _insurance;
        entertainment = _entertainment;
        clothing = _clothing;
        miscellaneous=_miscellaneous;

    }

}
