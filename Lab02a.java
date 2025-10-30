import base.AbstructClass;
import models.Body;
import models.Brain;
import models.Men;
import models.MovieData;

public class Lab02a extends AbstructClass {
    public static void main(String[] args) {

        // in class work
        Brain ubaid_brain = new Brain();
        Body ubaid_body = new Body();
        Men ubaid = new Men(ubaid_brain, ubaid_body);

        ubaid.enableSound();
        ubaid.tellMeAboutYourSelf();
        ubaid.talk();
        ubaid.eat("pizza");

        // //////////// //
        // Assigment 2 //
        // //////////// //

        // Q1
        MovieData movie1 = new MovieData();
        movie1.set("Movie 1", "Director 1", 18888, 1111, 50000, 1000000);
        movie1.show();
        MovieData movie2 = new MovieData();
        movie2.set("Movie 2", "Director 2", 1578, 110, 5200000, 10000);
        movie2.show();

        // Q2
        

    }
}
