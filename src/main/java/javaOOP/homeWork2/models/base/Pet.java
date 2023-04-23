package javaOOP.homeWork2.models.base;

public class Pet extends Animal implements MakeSound {
    private String nickname;
    private String species;
    private boolean vaccination;
    private String coatColor;
    private String birthday;

    public Pet(Integer heightOfAnimal, Integer weightOfAnimal, String eyesColor, String nickname, String species, boolean vaccination, String coatColor, String birthday) {
        super(heightOfAnimal, weightOfAnimal, eyesColor);
        this.nickname = nickname;
        this.species = species;
        this.vaccination = vaccination;
        this.coatColor = coatColor;
        this.birthday = birthday;
    }

    public void caress() {
        System.out.println("It caresses me");
    }

    @Override
    public String toString() {
        return "Pet{" + super.toString() +
                "nickname='" + nickname + '\'' +
                ", species='" + species + '\'' +
                ", vaccination=" + vaccination +
                ", coatColor='" + coatColor + '\'' +
                ", birthday='" + birthday + '\'' + '}';
    }

    @Override
    public void makeSound() {
        System.out.println("Default sound");
    }
}
