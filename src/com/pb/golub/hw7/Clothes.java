package com.pb.golub.hw7;

public abstract class Clothes {
    public Size size;
    public String name;
    public String price;
    public String color;

    public Clothes(Size size, String name, String price, String color) {
        this.size = size;
        this.name = name;
        this.price = price;
        this.color = color;
    }
}
