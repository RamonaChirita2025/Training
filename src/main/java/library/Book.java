package library;

public class Book {
    private String name;
    private int year;
    private Author author;
    private double price;

    public Book(String name, int year, Author author, double price){
        this.name = name;
        this.author = author;
        this.price = price;
        this.year = year;

    }
    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}
