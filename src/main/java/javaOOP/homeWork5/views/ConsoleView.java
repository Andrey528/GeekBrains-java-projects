package javaOOP.homeWork5.views;

import javaOOP.homeWork5.models.PhoneUserScheme;
import javaOOP.homeWork5.models.SavingFormat;
import javaOOP.homeWork5.views.base.IView;
import javaOOP.homeWork5.views.base.ReadUserInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleView implements IView, ReadUserInput {
    private final Scanner scanner;

    public ConsoleView(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void showMenu() {
        showMessage("""
                Выберите из меню ("0" - стоп):\s
                1. Добавить контакт;
                2. Удаление контакта;
                3. Изменение контактных данных;
                4. Вывести все контактные данные (в нужном формате);
                5. Добавить формат сохранения;
                6. Удалить формат сохранения;
                7. Вывести все форматы сохранения;
                8. Выбрать формат сохранения.""");
    }

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }

    @Override
    public String readString() {
        return scanner.next();
    }

    @Override
    public int readInt() {
        return scanner.nextInt();
    }

    @Override
    public ArrayList<String> readMultipleStringInput() {
        ArrayList list = new ArrayList<>();
        while(true){
            showMessage("Let's add a new string value (\"0\" - to stop):");
            String input = readString();
            if(input.equals("0"))
                break;
            list.add(input);
        }
        return list;
    }

    @Override
    public PhoneUserScheme collectDataToUpdateContact(PhoneUserScheme contact) {
        PhoneUserScheme updateUserInfo = new PhoneUserScheme();
        showMessage("Let's add a new string value (\"0\" - to skip field):");
        for (int i = 0; i < 4; i++) {
            Object input;
            switch (i) {
                case 0 -> {
                    input = readString();
                    if (!((String) input).equals("0")) updateUserInfo.setUserName((String) input);
                    else updateUserInfo.setUserName(contact.getUserName());
                }

                case 1 -> {
                    input = readString();
                    if (!((String) input).equals("0")) updateUserInfo.setUserSurname((String) input);
                    else updateUserInfo.setUserSurname(contact.getUserSurname());
                }

                case 2 -> {
                    input = readMultipleStringInput();
                    if (!((ArrayList<?>) input).isEmpty()) updateUserInfo.setPhoneNumbers((ArrayList<String>) input);
                    else updateUserInfo.setPhoneNumbers(contact.getPhoneNumbers());
                }

                case 3 -> {
                    input = readString();
                    if (!((String) input).equals("0")) updateUserInfo.setAddress((String) input);
                    else updateUserInfo.setAddress(contact.getAddress());
                }
            }
        }
        return updateUserInfo;
    }

    @Override
    public SavingFormat readSavingFormat(){
        showMessage("Enter format name");
        String name = readString();
        showMessage("Enter format value");
        String value = readString();
        return new SavingFormat(name, value);
    }

    @Override
    public List<String> showWithIndex(List<PhoneUserScheme> phoneBook, String delimiter) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < phoneBook.size(); i++) {
            result.add(i + ") " + phoneBook.get(i).contactToString(delimiter));
        }
        return result;
    }
}
