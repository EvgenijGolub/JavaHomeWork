package com.pb.golub.hw6;

import java.util.Objects;

public class Animal {
    private String food;
    private String location;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void makeNoise(){
        System.out.println("Животное издает звук");
    }

    public void eat(){
        System.out.println("Животное ест еду");
    }

    public void sleep(){
        System.out.println("Животное спит");
    }
}