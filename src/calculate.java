import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scann = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        float num_1 = scan.nextInt();
        System.out.print("Введите второе число: ");
        float num_2 = scan.nextInt();

        System.out.println("\n1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        System.out.print("Выберите действие: ");
        String word = scann.nextLine();

        float res;
        if (word.equals("1")) {
            res = num_1 + num_2;
            System.out.println("Результат: " + res);
        } else if (word.equals("2")) {
            res = num_1 - num_2;
            System.out.println("Результат: " + res);
        } else if (word.equals("3")) {
            res = num_1 * num_2;
            System.out.println("Результат: " + res);
        } else if (word.equals("4")) {
            if (num_2 == 0) {
                System.out.println("Error");
            } else {
                res = num_1 / num_2;
                System.out.println("Результат: " + res);
            }
        }
    }
}
