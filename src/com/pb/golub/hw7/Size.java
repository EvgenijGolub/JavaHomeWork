package com.pb.golub.hw7;

public enum Size {
    XXS("XXS"),
    XS("XS"),
    S("s"),
    M("M"),
    L("L");


    public String size;

    Size(String size) {
        this.size = size;
    }

    public void getDesctiption(String size){
        if (size.equals(XXS)){
            System.out.println("Это детский размер");
        }
        else {
            System.out.println("Это взрослый размер");
        }
    }

    public void getEuroSize(String size){
        if (size.equals(XXS)){
            System.out.println("32");
        }
        else if (size.equals(XS)){
            System.out.println("34");
        }
        else if (size.equals(S)){
            System.out.println("36");
        }
        else if (size.equals(M)){
            System.out.println("38");
        }
        else {
            System.out.println("40");
        }



    }
}
