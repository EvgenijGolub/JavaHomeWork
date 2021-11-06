package com.pb.golub.hw6;

import java.util.Objects;

public class Dog extends  Animal{
    String name = "Собака";
    String noise = "лает";
    String food = "кость";
    String location = "будка";

    public void makeNoise(){
        System.out.println(name + noise);
    }

    public void eat(){
        System.out.println(name + "ест" + food);
    }

    public void sleep(){
        System.out.println(name + "спит");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(food, dog.food) && Objects.equals(location, dog.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), food, location);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
