package org.example;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetService {
    public static void main(String[] args) {
        HashSet<String> catNames = new HashSet<>();
        catNames.add("Бегемот");
        catNames.add("Пушок");
        catNames.add("Магвай");
        catNames.add("Барсик");
        catNames.add("Магвай");
        catNames.add("Черныш");


        System.out.println("List contains 'Барсик'. True or false: " + catNames.contains("Барсик"));

        catNames.remove("Бегемот");

        Iterator<String> i = catNames.iterator();
        while (i.hasNext())
            System.out.println(i.next());

        System.out.println(catNames.clone());

        catNames.clear();
    }

}
