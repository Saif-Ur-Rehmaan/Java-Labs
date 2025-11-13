package models;

import base.Book;
import helpers.AppHelper;

public class Fiction extends Book {
    private String gradeReadingLevel;

    public Fiction(String _title, String _author, String _gradeReadingLevel) {
        super(_title, _author);
        setAuthor(_author);
        setGradeReadingLevel(_gradeReadingLevel);
        setTitle(_title);
    }

    public void setGradeReadingLevel(String gradeReadingLevel) {
        this.gradeReadingLevel = gradeReadingLevel;
    }

    public String getGradeReadingLevel() {
        return gradeReadingLevel;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        AppHelper.MyPrint("Grading Reading Level: " + getGradeReadingLevel());
    }
}
