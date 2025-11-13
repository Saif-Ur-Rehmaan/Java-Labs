package models;

import base.MusicalComposition;
import helpers.AppHelper;

public class NationalAnthem extends MusicalComposition {
    private String nationName;

    public NationalAnthem(String _nationName, String _title, String _composer, int _year_written) {
        super(_title, _composer, _year_written);
        setNationName(nationName);
    }

    public void setNationName(String nationName) {
        this.nationName = nationName;
    }

    public String getNationName() {
        return nationName;
    }

    public void printInfo() {
        AppHelper.MyPrint("Nation: " + getNationName());
        AppHelper.MyPrint("Title: " + getTitle());
        AppHelper.MyPrint("Composer: " + getComposer());
        AppHelper.MyPrint("Year Written: " + getYear_written());
    }

}
