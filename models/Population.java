package models;

public class Population {
    int currentPopulation = 0;
    int annualBirth = 0;
    int annualDeath = 0;

    public Population(int _currentPopulation, int _annualBirth, int _annualDeath) {
        setAnnualBirth(_annualBirth);
        setAnnualDeath(_annualDeath);
        setCurrentPopulation(_currentPopulation);
    }

    public void setAnnualBirth(int annualBirth) {
        this.annualBirth = annualBirth;
    }

    public void setAnnualDeath(int annualDeath) {
        this.annualDeath = annualDeath;
    }

    public void setCurrentPopulation(int currentPopulation) {
        this.currentPopulation = currentPopulation;
    }

    public double getBirthRate() {
        return annualBirth / (currentPopulation == 0 ? 1 : currentPopulation);
    }

    public double getDeathRate() {
        return annualDeath / (currentPopulation == 0 ? 1 : currentPopulation);
    }
}
