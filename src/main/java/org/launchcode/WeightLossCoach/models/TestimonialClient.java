package org.launchcode.WeightLossCoach.models;


import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class TestimonialClient extends AbstractEntity{

    private String name;

    public TestimonialClient(String name){ this.name = name; }

    public TestimonialClient(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TestimonialClient that = (TestimonialClient) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }
}
