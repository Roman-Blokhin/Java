// НАСЛЕДОВАНИЕ КЛАССОВ

package Les_18;

public class Dogs extends Animals {  // добавляем наследование

    private String color;  // переменная приватная, будет только в этом классе

    public Dogs(String name, int age, String color) {  // конструктор, который будет вызывать данные от родителя
        super(name, age);
        this.color = color;  // добавили свою переменную color, она приватная, только для этого класса
    }

    public static void main(String[] args) {
        Dogs animal_2 = new Dogs("cake", 6, "grey");

        System.out.println("Имя: " + animal_2.name);
        System.out.println("Возраст: " + animal_2.age);
        System.out.println("Цвет: " + animal_2.color);
    }
}
