package com.company;

public class Main {
    private static Contact contact1 = new Contact("Vasya", "+3801234567");
    private static Contact contact2 = new Contact("Petya", "+3801234568");
    private static Contact contact3 = new Contact("Kolya", "+3801234569");
    private static Contact contact4 = new Contact("Ira", "+3801234560");

    public static void main(String[] args) {
	ContactManager myContactManager = new ContactManager();
	    myContactManager.addContact(contact1);
        myContactManager.addContact(contact2);
        myContactManager.addContact(contact3);
        myContactManager.addContact(contact4);

        Contact cont = myContactManager.searchContact("Vasya");
        System.out.println(cont.phoneNumber);
    }




}
