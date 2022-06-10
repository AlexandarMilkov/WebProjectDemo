package softuni.webprojectdemo.demo.models.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "bppks_count")
    private int booksCount;

    @ManyToOne
    private List<Book> books;

    @Column(nullable = false)
    private double price;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getBooksCount() {
        return booksCount;
    }

    public void setBooksCount(int booksCount) {
        this.booksCount = booksCount;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Order() {
    }
}
