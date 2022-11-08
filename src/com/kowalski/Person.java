package com.kowalski;

import java.util.Random;

public class Person {
    private Random random = new Random();
    private String name, surname;
    private int ticketQuantity;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.ticketQuantity = random.nextInt(1,5);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getTicketQuantity() {
        return ticketQuantity;
    }

    public void setTicketQuantity(int ticketQuantity) {
        this.ticketQuantity = ticketQuantity;
    }
}
