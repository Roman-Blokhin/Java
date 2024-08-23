package MY_CODE;

import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {
        int a = 0;
        while (a == 0){
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
            System.out.print("\nВыберите действие: ");
            String word = scann.nextLine();

            float res;
            if (word.equals("1")) {
                res = num_1 + num_2;
                System.out.println("\nРезультат: " + res);
            } else if (word.equals("2")) {
                res = num_1 - num_2;
                System.out.println("\nРезультат: " + res);
            } else if (word.equals("3")) {
                res = num_1 * num_2;
                System.out.println("\nРезультат: " + res);
            } else if (word.equals("4")) {
                if (num_2 == 0) {
                    System.out.println("\nError");
                } else {
                    res = num_1 / num_2;
                    System.out.println("\nРезультат: " + res);
                }
            }

            System.out.println("\n1. Продолжить");
            System.out.println("2. Закончить");

            System.out.print("\nВыберите действие: ");
            int num_3 = scan.nextInt();
            if (num_3 == 1){
                System.out.println(" ");
            } else {
                System.out.println("\nПрограмма закончена.");
                break;
            }
        }

    }
}
