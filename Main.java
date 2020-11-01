package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> arrayWord = new ArrayList<String>(); // создаю массив с набором слов
        arrayWord.add("Vasya");
        arrayWord.add("Petya");
        arrayWord.add("Gena");
        arrayWord.add("Alex");
        arrayWord.add("Jenya");
        arrayWord.add("Lena");
        arrayWord.add("Alena");
        arrayWord.add("Veronica");
        arrayWord.add("Petya");
        arrayWord.add("Liza");
        arrayWord.add("Vasya");
        arrayWord.add("Alena");
        arrayWord.add("Egor");
        arrayWord.add("Sasha");

        Set<String> unique = new HashSet<>(arrayWord); // вывожу список слов из массива (только уникальные)
        System.out.println("Выводим только уникальные слова из массива " + unique);

        System.out.println("Считаем сколько раз встречается каждое слово:");
        for (String s: unique){
            System.out.println(s + " : "+ Collections.frequency(arrayWord, s));  //нашел в интернете, с помощью метода
            //frequency можно посчитать сколько раз встречается значение в массиве
        }


        TelephoneNumber telephoneNumber = new TelephoneNumber();
        telephoneNumber.add("Leonov", "880023222421");
        telephoneNumber.add("Ivanov", "880023222422");
        telephoneNumber.add("Leonov", "880023222423");
        telephoneNumber.add("Leonov", "8800232224214");


        System.out.println(telephoneNumber.get("Leonov"));


    }
}
