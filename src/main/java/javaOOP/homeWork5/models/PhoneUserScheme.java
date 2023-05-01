package javaOOP.homeWork5.models;

import java.util.ArrayList;

public class PhoneUserScheme implements ContactToString {
    private String userName;
    private String userSurname;
    private ArrayList<String> phoneNumbers;
    private String address;

    public PhoneUserScheme() {
    }

    public PhoneUserScheme(String userName, String userSurname, ArrayList<String> phoneNumbers, String address) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.phoneNumbers = phoneNumbers;
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public ArrayList<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public String getAddress() {
        return address;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public void setPhoneNumbers(ArrayList<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String contactToString(String delimiter) {
        return userName + delimiter +
                userSurname + delimiter +
                phoneNumbers + delimiter +
                address;
    }
}
