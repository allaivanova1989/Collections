package org.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeService {
    public static void main(String[] args) {
        Deque<String> fruits = new ArrayDeque<>();

        fruits.add("Apple");
        fruits.add("Kiwi");
        fruits.add("Lemon");
        fruits.add("Avocado");
        fruits.add("Mango");
        fruits.addFirst("Orange");
        fruits.addLast("Pineapple");

        System.out.println(fruits);

        System.out.println("The First element is: "+ fruits.getFirst());

        System.out.println("The Last element is: " + fruits.getLast());

        System.out.println(fruits.pop());
        System.out.println(fruits.poll());

        System.out.println(fruits);

        System.out.println(fruits.pollFirst());
        System.out.println(fruits.pollLast());
        System.out.println(fruits);

        System.out.println("The first element is: " + fruits.peekFirst());
        System.out.println("The last element is: " + fruits.peekLast());
    }
}
