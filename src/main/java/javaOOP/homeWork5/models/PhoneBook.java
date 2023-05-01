package javaOOP.homeWork5.models;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private ArrayList<PhoneUserScheme> phoneBook;
    private Integer length;

    public PhoneBook() {
        this.phoneBook = new ArrayList<>();
        this.length = phoneBook.size();
    }

    public PhoneBook(ArrayList<PhoneUserScheme> phoneBook) {
        this.phoneBook = phoneBook;
        this.length = phoneBook.size();
    }

    public String addContact(PhoneUserScheme user) {
        if (phoneBook.add(user)) {
            length = phoneBook.size();
            return "Success";
        }
        else return "Fail to add contact";
    }

    public String deleteContact(Integer index){
        if (length != 0 && 0 <= index && index < length) {
            phoneBook.remove((int) index);
            length = phoneBook.size();
            return "Success";
        }
        else return "Fail to remove contact";
    }

    public String setContactData(int index, PhoneUserScheme contact) {
        if (0 <= index && index < length) {
            phoneBook.set(index, contact);
            return "Success";
        }
        else return "Unable to set contact info";
    }

    public PhoneUserScheme getContact (Integer index) {
        if (length != 0 && 0 <= index && index < length) return phoneBook.get(index);
        else return null;
    }

    public List<PhoneUserScheme> getAllContacts () {
        List<PhoneUserScheme> result = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            result.add(getContact(i));
        }
        return result;
    }
}
