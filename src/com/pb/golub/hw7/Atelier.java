package com.pb.golub.hw7;

public class Atelier {
    public static void main(String[] args) {
        dressMan(Clothes[]);

        dressWomen(Clothes[]);

    }

    static void dressMan(Clothes[] clothes){
        Pants pants1 = new Pants (Size.L, "штаны", "800",
                "черный");
        Tie tie = new Tie(Size.M, "галстук", "2000",
                "зеленый");
        Tshirt tshirt1 = new Tshirt(Size.XXS, "рубашка", "500",
                "розовая");
        Clothes[] clothes1 = new Clothes[] {pants1, tie, tshirt1};
        System.out.println(clothes1);
    }

    static void dressWomen(Clothes[] clothes){
        Pants pants2 = new Pants (Size.L, "штаны", "800",
                "черный");
        Skirt skirt = new Skirt(Size.S, "юбка", "1500",
                "голубая");
        Tshirt tshirt2 = new Tshirt(Size.XXS, "рубашка", "500",
                "розовая");
        Clothes [] clothes2 = new Clothes[] {pants2, skirt, tshirt2};
        System.out.println(clothes2);
    }


}
