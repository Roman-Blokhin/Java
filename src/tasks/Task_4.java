package tasks;

import java.util.ArrayList;

public class Task_4 {
    public static void main(String[] args) {

        // ЗАДАЧА 29 - Вставка элемента в массив по указанному индексу.
        // Задание: Вставьте элемент 99 на вторую позицию в массиве чисел.
        int[] array = {1, 1, 3, 4, 5};
        array[1] = 99;  // замена второго элемента
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
