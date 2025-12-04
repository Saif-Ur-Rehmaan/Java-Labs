package Lab05;

public class TestCustomer {
    public static void main(String[] args) {
        Customer c1= new Customer("Superman", "super@gmail.com");
        Customer c2= new Customer("spiderman", "spider@gmail.com");

        c1.addPurchase(5000);
        c1.addPurchase(450);
        c1.addPurchase(40);
        c1.addPurchase(4000);

        c2.addPurchase(540060);
        c2.addPurchase(44560);
        c2.addPurchase(4460);
        c2.addPurchase(440060);


        c1.displayCustomerInfo();
        c2.displayCustomerInfo();
    }
}
