package javaOOP.homeWork5.views.base;

import javaOOP.homeWork5.models.PhoneUserScheme;

import java.util.List;

public interface IView {
    void showMenu();
    void showMessage(String message);
    String readString();
    List<String> showWithIndex(List<PhoneUserScheme> phoneBook, String delimiter);
}
