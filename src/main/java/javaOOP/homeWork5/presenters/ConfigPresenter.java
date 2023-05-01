package javaOOP.homeWork5.presenters;

import javaOOP.homeWork5.models.FormatWorker;
import javaOOP.homeWork5.models.PhoneBook;
import javaOOP.homeWork5.models.PhoneUserScheme;
import javaOOP.homeWork5.views.ConsoleView;

import java.util.List;

public class ConfigPresenter {
    private ConsoleView view;
    private PhoneBook phoneBook;
    private FormatWorker formatWorker;

    public ConfigPresenter(ConsoleView view, PhoneBook phoneBook, FormatWorker formatWorker) {
        this.view = view;
        this.phoneBook = phoneBook;
        this.formatWorker = formatWorker;
    }

    private void processInput(int choose) {
        switch (choose) {
            case 1 -> {
                view.showMessage("""
                        Let's add new contact. Scheme is:
                        String userName; 
                        String userSurname; 
                        ArrayList<String> phoneNumbers; 
                        String address
                        """);
                view.showMessage(phoneBook.addContact(new PhoneUserScheme(
                        view.readString(),
                        view.readString(),
                        view.readMultipleStringInput(),
                        view.readString()
                )));
            }

            case 2 -> {
                view.showMessage("Select index of deleting contact");
                List<String> contactsData = view.showWithIndex(phoneBook.getAllContacts(), formatWorker.getSelectedFormat().getValue());
                contactsData.forEach(item -> view.showMessage(item));
                view.showMessage(phoneBook.deleteContact(view.readInt()));
            }

            case 3 -> {
                view.showMessage("Select index to change contact info");
                List<String> contactsData = view.showWithIndex(phoneBook.getAllContacts(), formatWorker.getSelectedFormat().getValue());
                contactsData.forEach(item -> view.showMessage(item));
                int index = view.readInt();
                PhoneUserScheme contact = phoneBook.getContact(index);
                view.showMessage(contact.contactToString(formatWorker.getSelectedFormat().getValue()));
                if (contact.toString() != "Can't find contact by input index") {
                    PhoneUserScheme updateContactData = view.collectDataToUpdateContact(contact);
                    phoneBook.setContactData(index, updateContactData);
                }
            }

            case 4 -> {
                List<String> contactsData = view.showWithIndex(phoneBook.getAllContacts(), formatWorker.getSelectedFormat().getValue());
                contactsData.forEach(item -> view.showMessage(item));
            }

            case 5 -> {
                view.showMessage(formatWorker.addSavingFormat(view.readSavingFormat()));
            }

            case 6 -> {
                view.showMessage("Select index of deleting format");
                formatWorker.getAllSavingFormats().forEach(item -> view.showMessage(item));
                formatWorker.deleteSavingFormat(view.readInt());
            }

            case 7 -> {
                formatWorker.getAllSavingFormats().forEach(item -> view.showMessage(item));
            }

            case 8 -> {
                view.showMessage("Select index of selected format");
                formatWorker.getAllSavingFormats().forEach(item -> view.showMessage(item));
                formatWorker.selectFormat(view.readInt());
            }

            default -> {
                view.showMessage("Error in options");
            }
        }

    }

    public void buttonClick() {
        while(true){
            view.showMenu();
            int choose = view.readInt();
            if(choose==0)
                break;
            if(choose < 0 || choose > 8) {
                view.showMessage("Error in choose. Please enter value from 0 to 16");
                continue;
            }
            processInput(choose);
        }
    }
}
