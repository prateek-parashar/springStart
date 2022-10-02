package com.springbook.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Autowired
    public Person(Parrot parrot) {
        System.out.println("Person Created!!");
        this.petParrot = parrot;
    }
    private String name;
    private Parrot petParrot;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getPetParrot() {
        return petParrot;
    }

    public void setPetParrot(Parrot petParrot) {
        this.petParrot = petParrot;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", petParrot=" + petParrot +
                '}';
    }
}
