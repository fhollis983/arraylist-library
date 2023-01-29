public class Book {
    
    private String title;
    private String subject;
    private int year;
    private int pages;
    private double rating;

    public Book(String title, String subject, int year, int pages, double rating) {
        this.title = title;
        this.subject = subject;
        this.year = year;
        this.pages = pages;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public int getLength() {
        return pages;
    }

    public double getRating() {
        return rating;
    }

    public String toString() {
        String str = "";
        str += "Title: " + this.title + " | Subject: " + this.subject + " | Year: " + this.year + " | Pages: " + this.pages + " | Rating: " + this.rating;
        return str;
    }
}