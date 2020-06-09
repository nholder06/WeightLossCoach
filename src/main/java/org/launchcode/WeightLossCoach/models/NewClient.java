package org.launchcode.WeightLossCoach.models;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Objects;


@Document(collection = "NewClient")
public class NewClient extends AbstractEntity{

    @Field
    private String firstName;

    @Field
    private String lastName;

    @Field
    private String email;

    private String briefDescription;


    public NewClient(String firstName, String lastName, String email, String briefDescription) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.briefDescription = briefDescription;
    }

    public NewClient(){}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getBriefDescription() {
        return briefDescription;
    }

    public void setBriefDescription(String briefDescription) {
        this.briefDescription = briefDescription;
    }

    @Override
    public String toString() {
        return "newClient{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", briefDescription='" + briefDescription + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NewClient newClient = (NewClient) o;
        return firstName.equals(newClient.firstName) &&
                lastName.equals(newClient.lastName) &&
                email.equals(newClient.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), firstName, lastName, email);
    }
}