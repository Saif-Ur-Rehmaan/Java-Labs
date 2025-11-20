package models;

public class HouseThatIsAnInvestment extends House {
    public HouseThatIsAnInvestment(double _currentValue, double _initialValue, String _streetAddress, String _sqft) {
        super( _currentValue,  _initialValue, _streetAddress, _sqft);
    }
    
    @Override
    public void display() {
        super.display();
    }
}
