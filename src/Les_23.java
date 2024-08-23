// Работа с исключениями - непроверяемые

import java.util.Scanner;

public class Les_23 {

    public static void main(String[] args) {

        // создали условие, где может возникнуть ошибка, если пользователь введет число - 0 - непроверяемое исключение

        double num_1 = 10;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        double num_2 = scan.nextDouble();
        System.out.print("Результат: " + num_1/num_2);

    }

}
