package com.greene.helloworldrest.model;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class Student {
    private String firstName;
    private String lastName;


    public Student(String firstName, String lastName) {
        super();
        this.firstName=firstName;
        this.lastName=lastName;

    }
}
