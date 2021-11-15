package com.pb.golub.hw6;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class VetClinic {
    public static void main(String[] args) throws Exception {
    Cat cat = new Cat ("Черныш", "Черный");
        cat.setFood("Вискас");
        cat.setLocation("Лукошко");

    Horse horse = new Horse("Ламар", "66");
        horse.setFood("Сено");
        horse.setLocation("Стойло");

    Dog dog = new Dog ("Рекс", "Овчарка");
        dog.setFood("Кости");
        dog.setLocation("Будка");

        Animal [] animals = new Animal[]{cat, horse, dog};

        Class clazz = Class.forName("hw6.Veterinarian");
        Constructor constr =  clazz.getConstructor();
        Object vet = constr.newInstance("Ветеринар");
        Method treatAnimal = clazz.getMethod("treatAnimal", Animal.class);
        for (Animal animal: animals) {
            treatAnimal.invoke(vet, animal);
        }
        Class catClazz = Cat.class;
    }
}