package com.pb.golub.hw6;

import java.lang.reflect.Constructor;

public class Veterinarian {
    private String name;

    public Veterinarian (String name){
        this.name = name;
    }

    public void treatAnimal(Animal animal){
        System.out.println("Ветеринар" + name + " лечит животное " + animal.getName() +
                " которое живет на " + animal.getLocation() + " которое ест " +
                animal.getFood());
    }
}
