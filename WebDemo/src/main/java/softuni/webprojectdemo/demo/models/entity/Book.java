package softuni.webprojectdemo.demo.models.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private String year;

    @Column(nullable = false)
    private int pages;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String resioume;


    @ManyToMany(fetch = FetchType.LAZY)
    private Set<Author> authors;

    @OneToMany
    private Set<Comment> comments;


    public Book() {
    this.authors = new HashSet<>();
    this.comments = new HashSet<>();
    }



    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getResioume() {
        return resioume;
    }

    public void setResioume(String resioume) {
        this.resioume = resioume;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }


}
