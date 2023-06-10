package com.blz;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ContactMethods obj = new ContactMethods();
        Scanner scan = new Scanner(System.in);
        System.out.println("--------------------Welcome To Address Book Program-----------------------");
        while(true) {
            System.out.println("Select the options\n 1. Add Contact\n 2. Display Object\n 3. Edit Existing Contact\n 4.Exit");
            int choice = scan.nextInt();
            switch (choice) {
                case 1 : obj.addContact();
                    break;
                case 2 : obj.displayContacts();
                    break;
                case 3 : obj.EditContact();
                    break;
                case 4 : return;
                default:System.out.println("Enter Valid input");
            }
            scan.close();
        }
    }
}