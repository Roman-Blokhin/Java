// ПРОВЕРКА СТРОКОВЫХ УСЛОВИЙ

import java.util.Scanner;

public class les_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scan.nextLine();
        System.out.println("Ваше имя: " + name);
        if (name.equals("Roman") || (name.equals("roman"))) {  // name.equals - нужно для проверки условия для строк
            System.out.println("Вы администратор");
        } else {
            System.out.println("Вы обычный пользователь");
        }
    }
}
