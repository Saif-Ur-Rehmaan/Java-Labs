package base;

import helpers.AppHelper;

public class Book {
    private String title;
    private String author;

    public Book(String _title, String _author) {
        setAuthor(_author);
        setTitle(_title);
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

     public void printInfo() {
        AppHelper.MyPrint("Title: " + getTitle());
        AppHelper.MyPrint("Author: " + getAuthor());
    }
}
