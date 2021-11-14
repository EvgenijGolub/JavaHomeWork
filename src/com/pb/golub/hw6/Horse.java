package com.pb.golub.hw6;

import java.util.Objects;

public class Horse extends Animal{
    private String speed;

    public Horse(String name, String speed) {
        super(name);
        this.speed = speed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Ржет");;
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест");;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                ", name='" + name + '\'' +
                ", breed='" + speed + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Horse horse = (Horse) o;
        return Objects.equals(speed, horse.speed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed);
    }
}
