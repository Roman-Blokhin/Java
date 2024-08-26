package tasks;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        // ЗАДАЧА 29 - Вставка элемента в массив по указанному индексу.
        // Задание: Вставьте элемент 99 на вторую позицию в массиве чисел.
        int[] array = {1, 1, 3, 4, 5};
        array[1] = 99;  // замена второго элемента
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println();

        // ЗАДАЧА 32 - Генерация случайных чисел с помощью класса Random.
        // Задание: Сгенерируйте и выведите пять случайных чисел от 0 до 10.
        Random randomScan = new Random();  // запрашиваем память на рандомайзер
        int score = 0;
        for (int i = 0; i < 5; i++) {  // записываем рандомайзер в цикл, все числа будут новые
            int randomNum = randomScan.nextInt(10);  // рандомное число от 0 до 10
            System.out.print(randomNum + " ");
            score += 1;
        };
        int randomNum = randomScan.nextInt();  // любое рандомное число без диапазона
        System.out.println("\n" + randomNum);

        double randomNumDouble = randomScan.nextDouble();  // любое рандомное число с плавающей точкой, от 0 до 1
        System.out.println(randomNumDouble);

        boolean randomBoolean = randomScan.nextBoolean();  // рандомное boolean значение
        System.out.println(randomBoolean);

        System.out.println();

        // ЗАДАЧА 33 - Использование цикла for-each для вывода элементов массива.
        // Задание: Выведите каждый элемент массива чисел.
        int[] arrayList = {1, 5, 78, 90, 45789};
        for (int a: arrayList ) {  // компактная запись для вывода массива
            System.out.print(a + " ");
        }

        System.out.println();

        // ЗАДАЧА 34 - Использование switch-case для обработки ввода пользователя.
        // Задание: Прочитайте символ с клавиатуры, используя switch-case, выполните действия в зависимости от символа
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int enter = scanner.nextInt();
        switch (enter){
            case 1 -> System.out.println("Вы ввели число: " + enter);
            case 2 -> System.out.println("Вы ввели число: " + enter);
            default -> System.out.println("Ваше число не очень понятно нашей системе");
        }


    }
}
