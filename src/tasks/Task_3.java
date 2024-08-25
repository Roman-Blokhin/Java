package tasks;

import lessonScanner.Scan;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Task_3 {
    public static void main(String[] args) {

        // ЗАДАЧА 21 - Использование условного оператора if-else.
        // Задание: Проверьте, является ли число 5 положительным.
        int num = 5;
        if (5 > 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // ЗАДАЧА 22 - Использование тернарного оператора.
        // Задание: Присвойте переменной result значение "положительное" или "отрицательное", исходя из знака числа -10.
        int number = -10;
        String info = number > 0 ? "Положительное" : "Отрицательное";
        System.out.println(info);

        // ЗАДАЧА 23 - Вывод в консоль значения переменной.
        // Задание: Выведите значение переменной x, равное 10.
        int x = 10;
        System.out.println(x);

        // ЗАДАЧА 24 - Использование модификатора final с переменной.
        // Задание: Объявите переменную final и присвойте ей значение. Попытайтесь изменить это значение.
        final String QWERTY = "прыг-скок";
        System.out.println(QWERTY);
        // QWERTY = "567"; // если пытаться изменить константу, будет ошибка

        // ЗАДАЧА 26 - Строгий контроль типов данных.
        // Задание: Продемонстрируйте строгий контроль типов в Java, объявив
        // переменные разных типов и попытавшись присвоить их друг другу без явного приведения типов.
        int q = 56;
        String mane = "yu";
        // q = "fgjhfg";  // если убрать комментарий, то будет ошибка
        // mane = 67;

        // ЗАДАЧА 27 - Использование цикла while для вывода чисел от 1 до 5.
        // Задание: Используйте цикл while для вывода чисел от 1 до 5.
        int tyu = 0;
        while (tyu != 5){
            System.out.println(tyu);
            tyu++;
        }

        // ЗАДАЧА 25 - Использование класса Scanner для ввода данных.
        // Задание: Запросите у пользователя ввести его имя и выведите приветствие.
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scan.nextLine();
        System.out.println("Hello, " + name);
    }
}
