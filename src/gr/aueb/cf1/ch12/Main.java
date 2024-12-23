package gr.aueb.cf1.ch12;

import gr.aueb.cf1.ch12.model.*;

public class Main {

    public static void main(String[] args) {

        Teacher teacher = new Teacher(1, "Christos", "Ftoulis");
        User user = new User(1, " Costas", "Mask", "cmask", "16580", true );
        Customer customer = new Customer(1, "Andrew", "Dimitriou", "075695879", "6956879562", "Attika", "Athens", "Athens", "Tzeva", "5", "11744");
        Point point = new Point(0, 10);
        Order order = new Order(1, 5.5, "Meat", "ORDERED");

        System.out.println("Teacher full name: " + teacher.getFirstname() + ", " +teacher.getLastname());
        System.out.println("User username: " +user.getUsername());
        System.out.println("Customer vat: " + customer.getVatRegistrationNo());
        System.out.println("Order Formatted timestamp: " + order.getFormattedTimestamp());
        System.out.printf("Point: {%d, %d}\n", point.getX(), point.getY());
    }
}
