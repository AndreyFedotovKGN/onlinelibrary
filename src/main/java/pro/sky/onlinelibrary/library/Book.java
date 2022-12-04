package pro.sky.onlinelibrary.library;

public class Book {

    private Author author;

    private int id;

    public int getId() {
        return id;
    }

    private static int counter = 0;

    private String title;

    private int rentalPrice;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(int rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Book(Author author, String title, int rentalPrice) {
        this.id = counter++;
        this.author = author;
        this.title = title;
        this.rentalPrice = rentalPrice;
    }
}
