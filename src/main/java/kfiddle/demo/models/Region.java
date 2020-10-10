package kfiddle.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Region {
    @Id
    @GeneratedValue
    private Long id;

    private String region;

    @OneToMany
    private Collection<Wine> wines;


    public Long getId() {
        return id;
    }

    public String getRegion() {
        return region;
    }

    public Collection<Wine> getWines() {
        return wines;
    }

    public Region() {

    }

    public Region(String region) {
        this.region = region;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region1 = (Region) o;
        return Objects.equals(region, region1.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region);
    }
}
