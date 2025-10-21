package library;

import java.util.Objects;

public class Book {

    private String title;
    private String authorName;
    private double price;
    private int quantity;
    private int id;


    public Book(String title, String authorName, double price) {
        this.title = title;
        this.authorName = authorName;
        this.price = price;
    }

    public Book(String title, String authorName, double price, int quantity, int id) {
        this.title = title;
        this.authorName = authorName;
        this.price = price;
        this.quantity = quantity;
        this.id = id;
    }

    public Book(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(price, book.price) == 0 && quantity == book.quantity && id == book.id && Objects.equals(title, book.title) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, authorName, price, quantity, id);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}


