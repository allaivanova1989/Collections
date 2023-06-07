package org.example;

import java.util.LinkedHashSet;

public class LinkedHashSetService {
    public static void main(String[] args) {
        LinkedHashSet<String> catNames = new LinkedHashSet<>();
        catNames.add("Бегемот");
        catNames.add("Пушок");
        catNames.add("Магвай");
        catNames.add("Барсик");
        catNames.add("Магвай");
        catNames.add("Черныш");

        System.out.println(catNames.clone());

        catNames.clear();
    }
}
