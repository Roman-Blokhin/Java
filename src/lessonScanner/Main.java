package lessonScanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите имя: ");
        Scanner sc = new Scanner(System.in);
        String info = sc.nextLine();

        System.out.print("Введите ваш возраст: ");
        Scanner sc_2 = new Scanner(System.in);
        int num = sc_2.nextInt();

        Scan user1 = new Scan(info, num);

        System.out.println("1 пользователь: ");
        user1.newUser();

        System.out.print("Введите имя: ");
        Scanner sc_3 = new Scanner(System.in);
        String info_2 = sc_3.nextLine();

        System.out.print("Введите ваш возраст: ");
        Scanner sc_4 = new Scanner(System.in);
        int num_2 = sc_4.nextInt();

        Scan user2 = new Scan(info_2, num_2);

        System.out.println("2 пользователь: ");
        user2.newUser();
    }
}
