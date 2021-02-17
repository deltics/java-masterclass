package nz.co.deltics.udemy.javamasterclass.section8.ex44;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }


    public boolean addNewContact(Contact contact) {
        if (myContacts.contains(contact))
            return false;

        for (Contact existing : myContacts) {
            if ((existing.getName() == contact.getName()) && (existing.getPhoneNumber() == contact.getPhoneNumber()))
                return false;
        }

        this.myContacts.add(contact);

        return true;
    }


    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (!myContacts.contains(oldContact))
            return false;

        myContacts.set(myContacts.indexOf(oldContact), newContact);

        return true;
    }


    public boolean removeContact(Contact contact) {

        if (!myContacts.contains(contact))
            return false;

        myContacts.remove(contact);

        return true;
    }


    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }


    private int findContact(String name) {
        Contact contact = queryContact(name);

        return myContacts.indexOf(contact);
    }


    public Contact queryContact(String name) {

        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact c = this.myContacts.get(i);
            if (c.getName().equals(name))
                return c;
        }
        return null;
    }


    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            Contact c = myContacts.get(i);
            System.out.println((i + 1) + ". " + c.getName() + " -> " + c.getPhoneNumber());
        }
    }
}
