// ПОЛУЧЕНИЕ ДАННЫХ ОТ ПОЛЬЗОВАТЕЛЯ

import java.util.Scanner;  // 1. библиотека для получения данных от пользователя

public class les_2 {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);  // 2. создаем переменную, выделяем память под сбор данных

        System.out.print("Введите свое имя: ");
        String user_name = info.nextLine();  // 3. запрашиваем данные типа Строка у пользователя и записываем в переменную

        System.out.print("Введите ваш возраст: ");
        int age = info.nextInt();  // 3. запрашиваем данные типа Число у пользователя и записываем в переменную

        System.out.println("Ваше имя: " + user_name + ". Ваш возраст: "+ age);
    }
}
