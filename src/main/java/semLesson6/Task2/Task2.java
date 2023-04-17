package semLesson6.Task2;

/**
 * 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
 * а) информационной системой ветеринарной клиники
 * б) архивом выставки котов
 * в) информационной системой Театра кошек Ю. Д. Куклачёва
 * Можно записать в текстовом виде, не обязательно реализовывать в java.
 */
public class Task2 {
    public static void main(String[] args) {
        Owner owner = new Owner("Ivan", "049269");
        Cat cat = new Cat("Matros", "standart", 9, owner);
        cat.sleep(true);
        Cat cat1 = new Cat("Matros", "standart", 9, owner);
        System.out.println(cat);
        System.out.println((cat.equals(cat1)));
    }
}
