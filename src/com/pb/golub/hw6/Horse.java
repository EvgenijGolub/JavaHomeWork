package com.pb.golub.hw6;

import java.util.Objects;

public class Horse extends Animal{
    String name = "Лошадь";
    String noise = "ржет";
    String food = "овес";
    String location = "стойло";

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
        Horse horse = (Horse) o;
        return Objects.equals(food, horse.food) && Objects.equals(location, horse.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), food, location);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
