import java.util.Scanner;

public class note {
    public static void main(String[] args) {
        System.out.println("1. Архив");
        System.out.println("2. Заметки");
        System.out.println("3. План");
        System.out.println("4. Новости");
        System.out.println("5. Выход");

        System.out.print("Выберите действие: ");
        Scanner scan = new Scanner(System.in);
        int info = scan.nextInt();

        if (info == 1) {
            System.out.println("1. Новое");
            System.out.println("2. Старое");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("5. ");
        } else if (info == 2) {
            System.out.println("1. Походы с палаткой");
            System.out.println("2. Восхождения");
            System.out.println("3. Морские путешествия");
            System.out.println("4. Перелеты");
            System.out.println("5. ");
        } else if (info == 3) {
            System.out.println("1. Создать маршрут");
            System.out.println("2. Продумать отпуск");
            System.out.println("3. Купить оборудование");
            System.out.println("4. Посмотреть обзор");
            System.out.println("5. Закупить провизию");
        } else if (info == 4) {
            System.out.println("1. Получение визы");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("5. ");
        } else if (info == 5) {
            System.out.println("Конец задачи..");
        }

    }
}
