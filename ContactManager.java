package contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactManager {
    private List<Contact> contacts;

    public ContactManager() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public Contact findContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null;
    }

    public void deleteContact(String name) {
        Contact contact = findContact(name);
        if (contact != null) {
            contacts.remove(contact);
        }
    }

    public void editContact(String oldName, String newName, String newPhoneNumber, String newEmail) {
        Contact contact = findContact(oldName);
        if (contact != null) {
            contact.setName(newName);
            contact.setPhoneNumber(newPhoneNumber);
            contact.setEmail(newEmail);
        }
    }
}
