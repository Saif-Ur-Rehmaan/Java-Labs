package base;

public abstract class MusicalComposition {
    private String title;
    private String composer;
    private int year_written;

    public MusicalComposition(String _title, String _composer, int _year_written) {
        setComposer(_composer);
        setTitle(_title);
        setYear_written(_year_written);
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear_written(int year_written) {
        this.year_written = year_written;
    }

    public String getComposer() {
        return composer;
    }

    public String getTitle() {
        return title;
    }

    public int getYear_written() {
        return year_written;
    }
}
