package com.example.accessingdatarest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotEmpty
    private String name;

    @Min(0)
    @Max(150)
    private int age;
    private boolean active = true;

    // constructors
    protected Person(){}

    public Person(String name, int age, boolean active){
        this.name = name;
        this.age = age;
        this.active = active;
    }

    // Get and Set methods
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public boolean getActive(){
        return this.active;
    }

    public void setActive(Boolean active){
        this.active = active;
    }
}


