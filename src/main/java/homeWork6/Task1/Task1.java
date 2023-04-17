package homeWork6.Task1;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 * Создать множество ноутбуков.
 * Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
 * “Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем ЖД
 * 3 - Операционная система
 * 4 - Цвет …
 * Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
 */
public class Task1 {
    private static Set<Laptop> setOfLaptops = new HashSet<>();
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        fillSet();

        boolean stop = false;
        while (!stop) {
            String input = getUserInput("Выберите из меню (\"q\" - стоп): " +
                    "\n1. Показать множество ноутбуков;" +
                    "\n2. Фильтрация.");

            switch (input) {
                case "q":
                    stop = true;
                    break;
                case "1":
                    printSet();
                    break;
                case "2":
                    filtration();
                    break;
                default:
                    System.out.println("Нет такого варианта)");
                    break;
            }
        }
    }
    private static void fillSet() {
        Laptop laptop1 = new Laptop(4, 1000, "Kasandra", 4, "intel i7");
        Laptop laptop2 = new Laptop(2, 100, "windows 10", 4, "intel i5");
        Laptop laptop3 = new Laptop(8, 500, "linux", 8, "intel i3");
        Laptop laptop4 = new Laptop(16, 2, "ubuntu", 2, "amd 700");
        Laptop laptop5 = new Laptop(32, 100, "windows 11", 1, "amd 900");

        setOfLaptops.add(laptop1);
        setOfLaptops.add(laptop2);
        setOfLaptops.add(laptop3);
        setOfLaptops.add(laptop4);
        setOfLaptops.add(laptop5);
    }

    private static void printSet() {
        setOfLaptops.forEach(item -> System.out.println(item));
    }

    private static String getUserInput(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        return input;
    }

    private static void filtration() {
        HashMap<String, String> filtrationParams = new HashMap<>();
        HashMap<String, String> filtrationTegs = new HashMap<>();

        filtrationTegs.put("ram", "объем ОЗУ");
        filtrationTegs.put("hdd", "объем жесткого диска");
        filtrationTegs.put("operatingSystem", "операционная система");
        filtrationTegs.put("videoCard", "видеокарта");
        filtrationTegs.put("cpu", "процессор");

        filtrationTegs.forEach((k, v) -> {
            String input = getUserInput("Введите " + v + " или q если хотите пропустить параметр");
            if (!input.equals("q")) filtrationParams.put(k, input);
        });

        System.out.println("Вашим параметрам фильтрации:");
        filtrationParams.forEach((k, v) -> System.out.print(k + " : " + v + ", "));
        System.out.println("\nСоответствуют:");

        Set<Laptop> filteredSet = setOfLaptops.stream().filter(s ->
                ((filtrationParams.get("ram") == null) || (Integer.parseInt(filtrationParams.get("ram")) <= s.getRam())) &&
                ((filtrationParams.get("hdd") == null) || (Integer.parseInt(filtrationParams.get("hdd")) <= s.getHdd())) &&
                ((filtrationParams.get("operatingSystem") == null) || (filtrationParams.get("operatingSystem").equals(s.getOperatingSystem()))) &&
                ((filtrationParams.get("videoCard") == null) || (Integer.parseInt(filtrationParams.get("videoCard")) <= s.getVideoCard())) &&
                ((filtrationParams.get("cpu") == null) || (filtrationParams.get("cpu").equals(s.getCpu())))
        ).collect(Collectors.toSet());
        filteredSet.forEach(item -> System.out.println(item));
    }
}
