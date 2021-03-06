package kfiddle.demo.models;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Wine {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String color;

    @ManyToOne
    private Region region;

    @OneToMany (mappedBy = "wine")
    private Collection<Review> reviews;



    public Long getId() {
        return id;
    }
    public Region getRegion() {
        return region;
    }
    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

    public Collection getReviews(){
        return reviews;
    }


    protected Wine(){
    }

    public Wine(String name, Region region, String color) {
        this.name = name;
        this.region = region;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wine wine = (Wine) o;
        return Objects.equals(name, wine.name) &&
                Objects.equals(region, wine.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, region);
    }

}
