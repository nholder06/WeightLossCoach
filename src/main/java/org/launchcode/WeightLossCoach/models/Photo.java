package org.launchcode.WeightLossCoach.models;

import org.bson.types.Binary;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document(collection = "photos")
public class Photo extends AbstractEntity{

    private String name;

    private Binary image;

    public Photo(String name, Binary image) {

        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Binary getImage() {
        return image;
    }

    public void setImage(Binary image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Photo photos = (Photo) o;
        return  Objects.equals(name, photos.name) &&
                Objects.equals(image, photos.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, image);
    }
}
