package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapService {
    public static void main(String[] args) {
        HashMap<Integer, String> passportsAndNames = new HashMap<>();
        passportsAndNames.put(212133, "Лидия Бубликова");
        passportsAndNames.put(162348, "Иван Серебряков");
        passportsAndNames.put(8082771, "Дональд Трамп");
        System.out.println(passportsAndNames);

        String lidiaName = passportsAndNames.get(212133);
        System.out.println(lidiaName);


        passportsAndNames.remove(162348);
        System.out.println(passportsAndNames);

        System.out.println(passportsAndNames.containsKey(11111));
        System.out.println(passportsAndNames.containsValue("Дональд Трамп"));

        Set<Integer> keys = passportsAndNames.keySet();
        System.out.println("Ключи: " + keys);

        ArrayList<String> values = new ArrayList<>(passportsAndNames.values());
        System.out.println("Значения: " + values);

        System.out.println(passportsAndNames.size());
        passportsAndNames.clear();

        if (!passportsAndNames.isEmpty()) {

            System.out.println(passportsAndNames);

        }
    }
}
