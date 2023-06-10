package com.blz;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactMethods {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Contact> contactBook = new ArrayList<>();

    public static void addContact() {
        System.out.println("Enter First Name: ");
        String first = scanner.next();

        System.out.println("Enter Last Name: ");
        String last = scanner.next();

        System.out.println("Enter Address ");
        String address = scanner.next();

        System.out.println("Enter City ");
        String city = scanner.next();

        System.out.println("Enter State ");
        String state = scanner.next();

        System.out.println("Enter Zip Code ");
        int zip = scanner.nextInt();

        System.out.println("Enter Phone number ");
        int phone = scanner.nextInt();

        System.out.println("Enter Email ");
        String email = scanner.next();

        Contact contact = new Contact(first, last, address, city, state, zip, phone, email);
        contactBook.add(contact);
        System.out.println("Contact added successfully");
    }

    public static void displayContacts() {
        System.out.println("Contacts available in Address book");
        for (Contact person : contactBook) {
            System.out.println(person.toString());
        }
    }
}
