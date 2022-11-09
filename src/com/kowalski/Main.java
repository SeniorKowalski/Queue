package com.kowalski;

import java.util.*;

public class Main {

    public static List<Person> personList = new ArrayList<>();
    public static String[] names = {"John", "Bruce", "Rick", "Eric", "Kyle", "Jack", "Sam"};
    public static String[] surnames = {"Smith", "Wayne", "Stone", "Cartman", "Black", "Pinkman", "White"};

    public static void main(String[] args) {
        generatePersons(personList);
        Deque<Person> carousel = new ArrayDeque<>();
        carousel.addAll(personList);
        while (!carousel.isEmpty()) {
            if (carousel.getFirst().getTicketQuantity() > 0) {
                System.out.println(carousel.getFirst().getName() + " " + carousel.getFirst().getSurname() + " " + carousel.getFirst().getTicketQuantity());
                carousel.getFirst().setTicketQuantity(carousel.getFirst().getTicketQuantity() - 1);
                carousel.addLast(carousel.getFirst());
                carousel.pollFirst();
            } else {
                carousel.pollFirst();
            }
        }
    }

    public static List<Person> generatePersons(List<Person> personList) {
        for (int i = 0; i < 7; i++) {
            personList.add(new Person(names[i], surnames[i]));
        }
        return personList;
    }
}
