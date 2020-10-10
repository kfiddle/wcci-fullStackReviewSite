package kfiddle.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
public class Review {
    @Id
    @GeneratedValue
    private Long id;
    private String content;

    @ManyToOne
    private Wine wine;

    public Long getId() {
        return id;
    }

    public String getContent(){
        return content;
    }
    public Wine getWine() {
        return wine;
    }


    public Review(){
    }

    public Review(String content, Wine wine) {
        this.content = content;
        this.wine = wine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return Objects.equals(content, review.content) &&
                Objects.equals(wine, review.wine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, wine);
    }
}
