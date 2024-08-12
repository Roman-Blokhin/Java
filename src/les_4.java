// УСЛОВНЫЕ КОНСТРУКЦИИ IF-ELSE

import java.util.Scanner;

public class les_4 {
    public static void main(String[] args) {
        int num = 10;
        System.out.print("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if (num > age) {
            System.out.println("Базовое число больше введенного пользователем");
        } else if (num < age) {
            System.out.println("Базовое число меньше");
        } else {
            System.out.println("Числа равны");
        }
    }
}
