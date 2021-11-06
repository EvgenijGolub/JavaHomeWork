package com.pb.golub.hw5;

public class Library {
    public static void main(String[] args) {
        int takenbook = 3;
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        book1.title = "Приключения";
        book1.year = "2000";
        book1.autorsname = "Иванов И. И.";

        book2.title = "Словарь";
        book2.year = "1980";
        book2.autorsname = "Сидоров А. В.";

        book3.title = "Энциклопедия";
        book3.year = "2010";
        book3.autorsname = "Гусев К. В.";

        Reader reader1 = new Reader();
        Reader reader2 = new Reader();
        Reader reader3 = new Reader();

        reader1.username = "Петров В. В.";
        reader1.usernumber = "138";
        reader1.facname = "Экономики";
        reader1.birthdate = "01.05.1999";
        reader1.telnumber = "+380978648978";

        reader2.username = "Николаев А. С.";
        reader2.usernumber = "144";
        reader2.facname = "Физики";
        reader2.birthdate = "26.08.1997";
        reader2.telnumber = "+380678949876";

        reader3.username = "Громов С. В.";
        reader3.usernumber = "201";
        reader3.facname = "Математики";
        reader3.birthdate = "29.09.2000";
        reader3.telnumber = "+3805097165498";

        System.out.println(book1.getinfo());
        System.out.println(book2.getinfo());
        System.out.println(book3.getinfo());

        System.out.println(reader1.getinfousr());
        System.out.println(reader2.getinfousr());
        System.out.println(reader3.getinfousr());

        reader1.takeBook(int takenbook);
        reader1.takeBook(String title);
        reader1.takeBook(String title, String autorsname, String year);

        reader1.returnBook(int takenbook);
        reader1.returnBook(String title);
        reader1.returnBook(String title, String autorsname, String year);
    }
}
