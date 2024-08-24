package tasks;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Date;

public class Task_2 {
    public static void main(String[] args) {

        // ЗАДАЧА 11 - Использование методов класса String, таких как length().
        // Задание: Выведите длину строки "Hello, world!".
        String welcome = "Hello, world!";
        System.out.println(welcome.length());

        // ЗАДАЧА 12 - Преобразование всех символов строки в верхний регистр.
        // Задание: Преобразуйте строку "hello, world" в верхний регистр.
        String newg = welcome.toUpperCase();
        System.out.println(newg);

        // ЗАДАЧА 13 - Замена подстроки в строке.
        // Задание: Замените "Java" на "Kotlin" в строке "Hello, Java".
        String word = "Hello, Java";
        String newWord = word.replace("Java", "Kotlin");
        System.out.println(word);
        System.out.println(newWord);

        // ЗАДАЧА 14 - Объявление одномерного массива целых чисел.
        //Задание: Объявите и инициализируйте массив целых чисел с элементами 1, 2, 3.
        int[] array = {1, 2, 3};
        String x = array[0] + " " + array[1] + " " + array[2];
        System.out.println(x);

        // ЗАДАЧА 15 - Изменение значения по индексу в массиве.
        // Задание: Измените второй элемент массива numbers из задачи 14 на 5.
        array[1] = 5;
        System.out.println(array[0] + "  " + array[1] + "  " + array[2]);

        // ЗАДАЧА 16 - Перебор элементов массива с помощью цикла for.
        // Задание: Выведите все элементы массива numbers из задачи 14.
        for (int i = 0; i < array.length; i++) {
            System.out.println(i);
        }

        // ЗАДАЧА 17 - Работа с датой и временем в Java.
        // Задание: Выведите текущую дату и время.
        Date d = new Date();
        System.out.println(d.toString());  // вызывает время и дату

        LocalDateTime now = LocalDateTime.now();  // еще один вариант вывода времени и даты
        System.out.println(now);

        // ЗАДАЧА 18 - Сравнение двух строк с помощью equals().
        // Задание: Сравните строки "hello" и "world" на равенство.
        String hello = "hello";
        String world = "world";
        System.out.println(hello.equals(world));  // сравнение строк

        // ЗАДАЧА 19 - Использование оператора остатка от деления.
        // Задание: Найдите остаток от деления 10 на 3.
        int num_1 = 10;
        int num_2 = 3;
        System.out.println(10 % 3);

        // ЗАДАЧА 20 - Логические операторы И и ИЛИ.
        // Задание: Продемонстрируйте использование логических операторов И (&&) и ИЛИ (||).
        int qw_1 = 5;
        int qw_2 = 6;
        int qw_3 = 5;
        if (qw_1 > qw_2 || qw_1 != qw_2) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        if (qw_2 > qw_1 && qw_1 == qw_3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
