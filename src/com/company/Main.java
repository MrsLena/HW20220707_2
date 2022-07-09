package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        //Дан список Book{String author, String title}. Необходимо сформировать map<String, List<String>> ,
        //где ключом будет автор, а значением - список книг данного автора.

        Map<String, ArrayList<String>> map = new HashMap<>();

        List<Book> ListBooks = new ArrayList<>();
        ListBooks.add(new Book("Чехов","Три сестры"));
        ListBooks.add(new Book("Чехов","Дядя Ваня"));
        ListBooks.add(new Book("Чехов","Вишневый сад"));
        ListBooks.add(new Book("Толстой","Война и мир"));
        ListBooks.add(new Book("Толстой","Анна Каренина"));
        ListBooks.add(new Book("Горький","Мать"));

        for (Book b: ListBooks) {

            if (map.get(b.author)==null) {
                ArrayList<String> TempList = new ArrayList<>();
                TempList.add(b.title);
                map.put(b.author,TempList);
            }
            //find author
            else {
                ArrayList<String> TempList = map.get(b.author);
                TempList.add(b.title);
                map.put(b.author,TempList);
            }
       }


        System.out.println(map);

    }
}
