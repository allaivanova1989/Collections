package org.example;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListService {
    public static void main(String[] args) {
        ArrayList<String> catNames = new ArrayList<>();
        catNames.add("Бегемот");
        catNames.add("Пушок");
        catNames.add("Магвай");
        catNames.add("Барсик");
        catNames.add("Магвай");
        catNames.add("Черныш");

        int barsikIndex = catNames.indexOf("Барсик");
        System.out.println(barsikIndex);

        String secondCatName = catNames.get(1);
        System.out.println(secondCatName);

        catNames.remove("Бегемот");
        System.out.println(catNames.contains("Бегемот"));

        catNames.set(0, "Луи");

        System.out.println(catNames.lastIndexOf("Магвай"));

        System.out.println(catNames.size());
        catNames.sort(Comparator.naturalOrder());
        System.out.println(catNames);

        catNames.clear();
    }


}