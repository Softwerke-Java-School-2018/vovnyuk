package main.java.entities.builders;

import java.time.LocalDate;

public class Builder {
    private String firstName;
    private String secondName;
    private LocalDate birthDay;
    private int id;
    private static int i = 1;

    public Builder(String firstName, String secondName, LocalDate birthDay) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthDay = birthDay;
        this.id = i++;
    }


    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public String toString()
    {
        return this.id + " " + this.firstName + " " + this.secondName + " " + this.birthDay;
    }
}


