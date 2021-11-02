package com.pb.golub.hw5;

public class Book {
    String title;
    String autorsname;
    String year;

    String getinfo()    {
        return "[Название: " + title + " Автор книги: "
                + autorsname + " Год издания: " + year + "]";
    }
}
