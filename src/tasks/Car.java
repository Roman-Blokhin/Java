package tasks;

// ЗАДАЧА 10 - Создание простого класса с методами и полями.
// Задание: Создайте класс Car с полями make и year и методом displayInfo(), который выводит информацию о машине.

public class Car{

    public static void main(String[] args) {  // создал класс + экземпляр, вызываю метод
        Car test = new Car("rot", 6784);
        displayInfo("robot", 1);
    }

    String make;  // переменные, которые будут использоваться, как аргументы
    int year;

    public Car(String make, int year) {  // конструктор класса, который принимает аргументы
        this.make = make;
        this.year = year;
    }

    public static void displayInfo(String make, int year){  // метод, который определяет, что делать при его вызове
        System.out.println("Модель: " + make);
        System.out.println("год выпуска: " + year);
    }

}
