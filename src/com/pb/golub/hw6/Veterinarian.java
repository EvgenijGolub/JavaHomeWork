package com.pb.golub.hw6;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class Veterinarian {
    public void treatAnimal(Animal animal) throws Exception {
        Class aniClazz = Class.forName("hw6.Animal");
        Constructor constr = aniClazz.getConstructor(new Class[] {String.class});
        Object obj = constr.newInstance("Cat");
        if (obj instanceof Animal){
            ((Animal) obj).getFood();
            ((Animal) obj).getLocation();
        }
    }
}
