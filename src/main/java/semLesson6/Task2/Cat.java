package semLesson6.Task2;

public class Cat {
    public String name;
    public String bread;
    public int age;
    public Owner owner;

    public Cat(String name, String bread, int age, Owner owner) {
        this.name = name;
        this.bread = bread;
        this.age = age;
        this.owner = owner;
    }

    public boolean sleep(boolean param) {
        return param;
    }

    public boolean isIll(boolean param) {
        return param;
    }

    public void eat() {
        System.out.println("Кот ест");
    }

    @Override
    public String toString() {
        return String.format("КОТ {name: %s, bread: %s, age: %s}", name, bread, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cat)
            return  (((Cat) obj).name.equals(this.name) &&
                    ((Cat) obj).bread.equals(this.bread) &&
                    ((Cat) obj).age == this.age &&
                    ((Cat) obj).owner.equals(this.owner));
        else return false;
    }
}
