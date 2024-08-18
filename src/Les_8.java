// Тернарный оператор - более компактная запись условия if else

import java.util.Scanner;

public class Les_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ведите ваш возраст: ");
        int age = scan.nextInt();

        String info = age >= 18 ? "Adult" : "Young";  // тернарный оператор, выполняется условие, присваивает Adult
        System.out.println("Ваша категория: " + info);

        switch (info){
            case "Adult" -> System.out.println("Доступ открыт, добро пожаловать!");
            default -> System.out.println("Доступ закрыт");
        }

    }
}
