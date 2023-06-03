package javaOOP.semLesson7.Observer;

public class Intern implements Observer {
    private final String name;

    public Intern(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        System.out.println(String.format("Intern %s: I am waiting for the better job! (company, salary) = %s, %d", name, nameCompany, salary));
    }
}
