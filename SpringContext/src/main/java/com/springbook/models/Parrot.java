package com.springbook.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Parrot {

    public Parrot(Person person) {
        this.p = person;
        System.out.println("Creating a parrot!");
    }
    private String name = "Kiki";
    private Person p;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                '}';
    }
}
