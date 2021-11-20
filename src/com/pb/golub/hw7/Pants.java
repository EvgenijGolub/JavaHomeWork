package com.pb.golub.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes {
    @Override
    public void dressMan(String Clothes) {
        System.out.println(name + ", " + size + ", " + price
                + ", " + color + ", ");
    }

    @Override
    public void dressWomen(String Clothes) {
        System.out.println(name + ", " + size + ", " + price
                + ", " + color + ", ");
    }

    public Pants(Size size, String name, String price, String color) {
        super(size, name, price, color);
    }
}
