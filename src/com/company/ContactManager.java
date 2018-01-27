package com.company;

public class ContactManager {
    Contact[] myFriends;
    int friendsCount;

    public ContactManager() {
        this.myFriends = new Contact[500];
        this.friendsCount = 0;
    }

    public void addContact (Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    public Contact searchContact (String searchName) {
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].name.equals(searchName)) {
                return myFriends[i];
            }
        }
        return null;
    }
}
