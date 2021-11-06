package com.pb.golub.hw6;

import java.util.Objects;

public class Cat extends Animal {
    String name = "Кот";
    String noise = "мяукает";
    String food = "мясо";
    String location = "лукошко";

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
        Cat cat = (Cat) o;
        return Objects.equals(food, cat.food) && Objects.equals(location, cat.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), food, location);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}