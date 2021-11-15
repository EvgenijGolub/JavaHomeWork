package com.pb.golub.hw7;

public class Tie extends Clothes implements ManClothes {
    @Override
    public void dressMan(String Clothes) {
        System.out.println(name + ", " + size + ", " + price
                + ", " + color + ", ");
    }

    public Tie(Size size, String name, String price, String color) {
        super(size, name, price, color);
    }
}
