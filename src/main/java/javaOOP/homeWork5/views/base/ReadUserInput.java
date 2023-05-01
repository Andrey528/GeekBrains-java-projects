package javaOOP.homeWork5.views.base;

import javaOOP.homeWork5.models.PhoneUserScheme;
import javaOOP.homeWork5.models.SavingFormat;

import java.util.ArrayList;

public interface ReadUserInput {
    String readString();
    int readInt();
    ArrayList<String> readMultipleStringInput();
    PhoneUserScheme collectDataToUpdateContact(PhoneUserScheme contact);
    SavingFormat readSavingFormat();
}
