package com.pb.golub.hw5;


public class Reader {
    String username;
    String usernumber;
    String facname;
    String birthdate;
    String telnumber;

    public void takeBook(int bookCount){
        System.out.println(username + " взял " + bookCount +  "книги ");
    }
    public void takeBook(String bookNames){
        System.out.println(username + " взял книги " + bookNames);
    }
    public void takeBook(String bookNames, String autorsname, String year){
        System.out.println(username + " взял книги: " + bookNames + autorsname + year);
    }

    public void returnBook(int bookCount){
        System.out.println(username + " вернул " + bookCount +  "книги ");
    }
    public void returnBook(String bookNames){
        System.out.println(username + " вернул книги " + bookNames);
    }
    public void returnBook(String bookNames, String autorsname, String year){
        System.out.println(username + " вернул книги: " + bookNames + autorsname + year);
    }

    String getinfousr(){
        return "[ФИО:" + username + " Номер читательского билета: "
                + usernumber + " Факультет: " + facname + " Дата рождения:  "
                + birthdate + " Телефон: " + telnumber + "]";
    }
}
