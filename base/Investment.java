package base;

import helpers.AppHelper;

public class Investment {
    private double initialValue;
    private double currentValue;
    private double profit;
    private double percentProfit;

    public Investment(double _currentValue, double _initialValue) {
        setInitialValue(_initialValue);
        setCurrentValue(_currentValue);
        calculateProfit();
        calculatePercentProfit();
    }

    private void calculateProfit() {
        this.profit = currentValue - initialValue;
    }

    private void calculatePercentProfit() {
        if (initialValue != 0) {
            this.percentProfit = (profit / (double) initialValue) * 100;
        } else {
            this.percentProfit = 0;
        }
    }

    public void setPercentProfit(double percentProfit) {
        this.percentProfit = percentProfit;
    }

    public double getPercentProfit() {
        return percentProfit;
    }

    public void setInitialValue(double initialValue) {
        this.initialValue = initialValue;
    }

    public double getInitialValue() {
        return initialValue;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public double getProfit() {
        return profit;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void display() {
        AppHelper.MyPrint("Inital Value: ", String.valueOf(initialValue));
        AppHelper.MyPrint("Current Value: ", String.valueOf(currentValue));
        AppHelper.MyPrint("Profit: ", String.valueOf(profit));
        AppHelper.MyPrint("Profit Percent: ", String.valueOf(percentProfit));
    }

}
