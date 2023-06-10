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
    public void EditContact() {
        System.out.println("\nEnter first name to edit :- ");
        String name = scanner.next();

        for(Contact person : contactBook) {
            if(name.equals(person.First_Name)) {
                System.out.print("\nSelect option to edit----\n1.First_name \n2.Last_name \n3.Address \n4.City \n5.State \n6.Zip_code \n7.Phone_number \n8.Email :- ");
                int option = scanner.nextInt();
                switch(option) {
                    case 1:
                        System.out.print("Enter new first name :- ");
                        String newFirstName = scanner.next();
                        person.setFirst_Name(newFirstName);
                        System.out.println("First name is updated.");
                        break;

                    case 2:
                        System.out.print("Enter new last name :- ");
                        String newLastName = scanner.next();
                        person.setLast_Name(newLastName);
                        System.out.println("Last name is updated.");
                        break;

                    case 3:
                        System.out.print("Enter new Address :- ");
                        String newAddress = scanner.next();
                        person.setAddress(newAddress);
                        System.out.println("Address is updated.");
                        break;

                    case 4:
                        System.out.print("Enter new city name :- ");
                        String newCity = scanner.next();
                        person.setCity(newCity);
                        System.out.println("City is updated.");
                        break;

                    case 5:
                        System.out.print("Enter new state name :- ");
                        String newState = scanner.next();
                        person.setState(newState);
                        System.out.println("State is updated.");
                        break;

                    case 6:
                        System.out.print("Enter new Zip code :- ");
                        int newZip = scanner.nextInt();
                        person.setZip_Code(newZip);
                        System.out.println("Zip code is updated.");
                        break;

                    case 7:
                        System.out.print("Enter new phone number :- ");
                        int newPhone = scanner.nextInt();
                        person.setPhone_Number(newPhone);
                        System.out.println("Phone number is updated.");
                        break;

                    case 8:
                        System.out.print("Enter new email :- ");
                        String newEmail = scanner.next();
                        person.setEmail(newEmail);
                        System.out.println("Email is updated.");
                        break;

                    default:
                        System.out.println("Please enter a number between 1 to 8 only...");

                }
            }
            else {
                continue;
            }
        }
    }
    public void DeleteContact() {
        System.out.print("Enter first name to delete contact:- ");
        String name_to_delete = scanner.next();

        for(int i = 0; i < contactBook.size(); i++) {
            String search_name_in_arrayList = contactBook.get(i).getFirst_Name();

            if(name_to_delete.equals(search_name_in_arrayList)) {
                contactBook.remove(i);
                System.out.println("\ncontact deleted successfully.");
                break;
            }
            else {
                continue;
            }
        }
    }
}
