package models;

import interfaces.IMen;
import base.AbstructClass;

public class Men extends AbstructClass implements IMen {
    private final Brain brain;
    private final Body body;
    private boolean actionWithSound = false;

    public Men(Brain brain, Body body) {
        this.brain = brain;
        this.body = body;
    }

    public void enableSound(){
        this.actionWithSound=true;
    }

    public String talk() {
        if (actionWithSound) {
            this.print("Lets talk about xyz");
        }
        return "Lets talk about xyz";
    }

    public String getAnswer(String question) {
        // do some calculations ...
        String answer = "Brother Asked a very good question..";
        if (actionWithSound) {
            this.print(answer);
        }
        return answer;
    }

    public String eat(String food) {
        if (actionWithSound) {
            this.print("yum yum yum...");
        }
        return "yum yum yum...";
    }

    public String tellMeAboutYourSelf() {
        String about = "about my brain :" + this.brain.about() + "\nAbout my body: " + this.body.about();
        if (actionWithSound) {
            this.print(about);
        }
        return about;
    }

}
