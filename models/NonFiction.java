package models;

import base.Book;
import helpers.AppHelper;

public class NonFiction extends Book {
    private int noOfPages;

    public NonFiction(String _title, String _author, int _noOfPages) {
        super(_title, _author);
        setAuthor(_author);
        setnoOfPages(_noOfPages);
        setTitle(_title);
    }

    public void setnoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public int getnoOfPages() {
        return noOfPages;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        AppHelper.MyPrint("Number of Pages: " + getNoOfPages());
    }
}
