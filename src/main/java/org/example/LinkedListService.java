package org.example;

import java.util.LinkedList;

public class LinkedListService {
    public static void main(String[] args) {
        LinkedList<String> catNames = new LinkedList<>();
        catNames.add("Бегемот");
        catNames.add("Пушок");
        catNames.add("Магвай");
        catNames.add("Черныш");
        catNames.addFirst("Магвай");
        catNames.addLast("Барсик");

        String firstCatName = catNames.peekFirst();
        String lastCatName = catNames.peekLast();
        System.out.println(firstCatName);
        System.out.println(lastCatName);

        catNames.pollFirst();
        catNames.pollLast();
        System.out.println(catNames);

    }
}
