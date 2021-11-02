package com.pb.golub.hw5;


public class Reader {
    String username;
    String usernumber;
    String facname;
    String birthdate;
    String telnumber;

    public void takeBook(int takenbook){
        System.out.println(username + " взял " + takenbook +  "книги ");
    }
    public void takeBook(String title){
        System.out.println(username + " взял книги " + title);
    }
    public void takeBook(String title, String autorsname, String year){
        System.out.println(username + " взял книги: " + title + autorsname + year);
    }

    public void returnBook(int takenbook){
        System.out.println(username + " вернул " + takenbook +  "книги ");
    }
    public void returnBook(String title){
        System.out.println(username + " вернул книги " + title);
    }
    public void returnBook(String title, String autorsname, String year){
        System.out.println(username + " вернул книги: " + title + autorsname + year);
    }

    String getinfousr(){
        return "[ФИО:" + username + " Номер читательского билета: "
                + usernumber + " Факультет: " + facname + " Дата рождения:  "
                + birthdate + " Телефон: " + telnumber + "]";
    }
}
