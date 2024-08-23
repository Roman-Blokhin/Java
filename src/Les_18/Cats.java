// НАСЛЕДОВАНИЕ КЛАССОВ

package Les_18;

public class Cats extends Animals {

    private String breed;

    public Cats(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public static void main(String[] args) {
        Cats animal_1 = new Cats("Rokky", 2, "pers");

        System.out.println("Имя: " + animal_1.name + ", возраст: " + animal_1.age + ", порода: " + animal_1.breed);
    }
}
