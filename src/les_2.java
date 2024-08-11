// ПОЛУЧЕНИЕ ДАННЫХ ОТ ПОЛЬЗОВАТЕЛЯ И МАТЕМАТИЧЕСКИЕ ДЕЙСТВИЯ

import java.util.Scanner;  // 1. библиотека для получения данных от пользователя

public class les_2 {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);  // 2. создаем переменную, выделяем память под сбор данных
        System.out.print("Введите свое имя: ");
        String user_name = info.nextLine();  // 3. запрашиваем данные типа Строка у пользователя и записываем в переменную
        System.out.println("Ваше имя: " + user_name);

        Scanner age = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        int age_num = age.nextInt();  // 3. запрашиваем данные типа Строка у пользователя и записываем в переменную
        System.out.println("Ваш возраст: " + age_num);
    }
}
