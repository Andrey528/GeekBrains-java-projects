package javaOOP.homeWork2.models;

import javaOOP.homeWork2.models.base.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();

    private Object getUserInput(String message, String dataType) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        switch (dataType) {
            case "str":
                return scanner.next();
            case "int":
                return scanner.nextInt();
            case "boolean":
                return scanner.nextBoolean();
            default:
                System.out.println("Нет такого варианта)");
                return 0;
        }
    }

    private void addAnimalInZoo () {
        boolean stop = false;
        while (!stop) {
            String message = "Выберите из меню (\"q\" - стоп): " +
                    "\n1. Добавить домашнее животное в зоопарк;" +
                    "\n2. Добавить дикое животное в зоопарк;" +
                    "\n3. Добавить птицу в зоопарк;";
            Object input = getUserInput(message, "str");


            switch ((String) input) {
                case "q":
                    stop = true;
                    break;
                case "1":
                    Animal animal = new Pet(
                            (int) getUserInput("heightOfAnimal", "int"),
                            (int) getUserInput("weightOfAnimal", "int"),
                            (String) getUserInput("eyesColor", "str"),
                            (String) getUserInput("nickname", "str"),
                            (String) getUserInput("species", "str"),
                            (boolean) getUserInput("vaccination", "boolean"),
                            (String) getUserInput("coatColor", "str"),
                            (String) getUserInput("birthday", "str")
                    );
                    System.out.println(animal.toString());
                    animals.add(animal);
                    break;
                case "2":
                    animals.add(new Wild(
                            (int) getUserInput("heightOfAnimal", "int"),
                            (int) getUserInput("weightOfAnimal", "int"),
                            (String) getUserInput("eyesColor", "str"),
                            (String) getUserInput("habitat", "str"),
                            (String) getUserInput("foundDate", "str")
                    ));
                    break;
                case "3":
                    animals.add(new Bird(
                            (int) getUserInput("heightOfAnimal", "int"),
                            (int) getUserInput("weightOfAnimal", "int"),
                            (String) getUserInput("eyesColor", "str"),
                            (int) getUserInput("flightAltitude", "int")
                    ));
                    break;
                default:
                    System.out.println("Нет такого варианта)");
                    break;
            }
        }
    }

    private void deleteAnimalFromZoo (Integer index) {
        if (animals.size() != 0 & 0 <= index & index < animals.size()) {
            animals.remove((int) index);
        }
        else System.out.println("Элемент под таким индексом не может быть удален");
    }

    private void printAnimalInZoo (Integer index) {
        if (animals.size() != 0 && 0 <= index && index < animals.size()) System.out.printf(animals.get(index).toString());
        else System.out.println("Элемент под таким индексом не может быть удален");
    }

    private void animalMakeSound(Integer index) {
        if (animals.get(index) instanceof MakeSound) ((MakeSound) animals.get(index)).makeSound();
        else System.out.println("Метод издавания звука не реализован");
    }

    private void printAllAnimals () {
        for (int i = 0; i < animals.size(); i++) {
            System.out.print(i + ") ");
            printAnimalInZoo(i);
            System.out.println();
        }
    }

    private void allAnimalsMakeSound() {
        for (int i = 0; i < animals.size(); i++) {
            animalMakeSound(i);
        }
    }

    private void addDefaultAnimals() {
        animals.add(new Dog(120, 15, "green", "fluff", "Husky", true, "gray", "12.04", true));
        animals.add(new Dog(80, 17, "gray", "mask", "Pudel", false, "pink", "15.03", false));
        animals.add(new Bird(40, 7, "white", 120));
        animals.add(new Pet(13, 1, "white", "Miki", "mouse", true, "Brown", "11.02"));
        animals.add(new Wild(15, 3, "brown", "Forest", "13.01"));
        animals.add(new Cat(25, 4, "black", "Kity", "Sfinks", false, "pink", "04.01", false));
        animals.add(new Chicken(5, 4, "black", 15));
        animals.add(new Stork(54, 3, "red", 500));
        animals.add(new Tiger(124, 70, "green", "forest", "12.07"));
        animals.add(new Wolf(124, 70, "green", "forest", "12.07", true));
    }

    public void zooInterface() {
        addDefaultAnimals();

        boolean stop = false;
        while (!stop) {
            String message = "Выберите из меню (\"q\" - стоп): " +
                    "\n1. Добавить животное в зоопарк;" +
                    "\n2. Убрать животное с номером i из зоопарка;" +
                    "\n3. Посмотреть информацию о животном с номером i;" +
                    "\n4. Заставить животное с номером i издать звук;" +
                    "\n5. Напечатать информацию о животных, которые есть на данный момент в зоопарке;" +
                    "\n6. Заставить всех животных, которые на данный момент есть в зоопарке, издать звук;" +
                    "\n7. Если есть птицы, пусть летают;" +
                    "\n8. Если есть домашние животные, пусть проявляют ласку;" +
                    "\n9. Если есть собаки, пусть дрессируются.";

            Object input = getUserInput(message, "str");

            switch ((String) input) {
                case "q":
                    stop = true;
                    break;
                case "1":
                    addAnimalInZoo();
                    break;
                case "2":
                    printAllAnimals();
                    deleteAnimalFromZoo((int) getUserInput("Введите индекс удаляемого животного", "int"));
                    break;
                case "3":
                    printAnimalInZoo((int) getUserInput("Введите индекс просматриваемого животного", "int"));
                    break;
                case "4":
                    animalMakeSound((int) getUserInput("Введите индекс животного, которое должно дать голос", "int"));
                    break;
                case "5":
                    printAllAnimals();
                    break;
                case "6":
                    allAnimalsMakeSound();
                    break;
                case "7":
                    animals.forEach(animal -> {
                        if (animal instanceof Bird) ((Bird) animal).Fly();
                    });
                    break;
                case "8":
                    animals.forEach(animal -> {
                        if (animal instanceof Pet) ((Pet) animal).caress();
                    });
                    break;
                case "9":
                    animals.forEach(animal -> {
                        if (animal instanceof Dog) ((Dog) animal).train();
                    });
                    break;
                default:
                    System.out.println("Нет такого варианта)");
                    break;
            }
        }
    }
}
