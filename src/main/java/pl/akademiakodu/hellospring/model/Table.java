package pl.akademiakodu.hellospring.model;

import java.util.Set;

/**
 * Created by Admin on 27.07.2017.
 */
public class Table {


    private String author;
    private String title;
    private Double price;

    public Table(String author, String title, Double price) {
        this.author = author;
        this.title = title;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Table{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
