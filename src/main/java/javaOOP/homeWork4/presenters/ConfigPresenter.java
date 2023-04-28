package javaOOP.homeWork4.presenters;

import javaOOP.homeWork4.models.ArrayHandler;
import javaOOP.homeWork4.views.ConsoleView;

import java.util.List;

public class ConfigPresenter {
    private ConsoleView view;
    private ArrayHandler arrayHandler;

    public ConfigPresenter(ConsoleView view, ArrayHandler arrayHandler) {
        this.view = view;
        this.arrayHandler = arrayHandler;
    }

    private void proceessInput(int choose) {
        switch (choose) {
            case 1 -> {
                view.showMessage("Let's add new element");
                boolean resultOfAdd = arrayHandler.add(view.readTypeOptions());
                view.showMessage("Result of add is " + resultOfAdd);
            }

            case 2 -> {
                view.showMessage("Enter index of deleted element:");
                arrayHandler.printAllElements().forEach(item -> view.showMessage((String) item));
                view.showMessage(arrayHandler.deleteElement(view.readInt() - 1));
            }

            case 3 -> {
                view.showMessage("Enter value, what need to be removed:");
                view.showMessage(arrayHandler.deleteAllElementsWithValue(view.readTypeOptions()));
            }

            case 4 -> {
                view.showMessage("Min in list is " + arrayHandler.findMinInList());
            }

            case 5 -> {
                view.showMessage("Max in list is " + arrayHandler.findMaxInList());
            }

            case 6 -> {
                view.showMessage("Sum of elements in list = " + arrayHandler.findSumElInList());
            }

            case 7 -> {
                view.showMessage("Op of elements in list = " + arrayHandler.findOpElInList());
            }

            case 8 -> {
                view.showMessage("Let's find index of your element in list");
                view.showMessage("It's " + arrayHandler.findIndexofContainsValue(view.readTypeOptions()));
            }

            case 9 -> {
                view.showMessage("Let's check if list contains your element");
                view.showMessage("It's " + arrayHandler.checkContainsValue(view.readTypeOptions()));
            }

            case 10 -> {
                arrayHandler.printAllElements().forEach(item -> view.showMessage((String) item));
                view.showMessage("Let's do Bubble sort");
                arrayHandler.bubbleSort();
                arrayHandler.printAllElements().forEach(item -> view.showMessage((String) item));
            }

            case 11 -> {
                arrayHandler.printAllElements().forEach(item -> view.showMessage((String) item));
                view.showMessage("Let's do Insertion sort");
                arrayHandler.insertionSort();
                arrayHandler.printAllElements().forEach(item -> view.showMessage((String) item));
            }

            case 12 -> {
                arrayHandler.printAllElements().forEach(item -> view.showMessage((String) item));
                view.showMessage("Let's do Selection sort");
                arrayHandler.selectionSort();
                arrayHandler.printAllElements().forEach(item -> view.showMessage((String) item));
            }

            case 13 -> {
                view.showMessage("Enter element index:");
                view.showMessage("Your element is " + arrayHandler.printElement(view.readInt()));
            }

            case 14 -> {
                view.showMessage("Enter index of element. Max index = " + (arrayHandler.getLength() - 1));
                view.showMessage(arrayHandler.set(view.readInt(), view.readTypeOptions()).toString());
            }

            case 15 -> {
                arrayHandler.printAllElements().forEach(item -> view.showMessage((String) item));
            }

            case 16 -> {
                view.showMessage("Array length = " + arrayHandler.getLength() );
            }

            default -> {
                view.showMessage("Error: incorrect option selected");
            }
        }

    }

    public void buttonClick() {
        while(true){
            view.showMenu();
            int choose = view.readInt();
            if(choose==0)
                break;
            if(choose < 0 || choose > 16) {
                view.showMessage("Error in choose. Please enter value from 0 to 16");
                continue;
            }
            proceessInput(choose);
        }
    }
}
