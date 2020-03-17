package com.example.accessingdatarest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private int age;
    private boolean isALive;// = true;

    // constructors
    protected Person(){}

    public Person(String name, int age, boolean isALive){
        this.name = name;
        this.age = age;
        this.isALive = isALive;
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

    public boolean getIsAlive(){
        return this.isALive;
    }

    public void setIsAlive(Boolean isAlive){
        this.isALive = isAlive;
    }
}


