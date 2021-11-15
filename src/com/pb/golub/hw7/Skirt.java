package com.pb.golub.hw7;

public class Skirt extends Clothes implements WomenClothes {

    @Override
    public void dressWomen(String Clothes) {
        System.out.println(name + ", " + size + ", " + price
                + ", " + color + ", ");
    }

    public Skirt(Size size, String name, String price, String color) {
        super(size, name, price, color);
    }
}
