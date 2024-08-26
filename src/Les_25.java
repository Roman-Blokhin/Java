// ИНТЕРФЕЙС LIST
// Работаем с массивом и добавляем в него новые элементы

import java.util.ArrayList;
import java.util.List;

public class Les_25 {
    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>();  // 1. создаем новый интерфейс List

        for (int i = 0; i < 10; i++) {  // 2. проходимся по всем элементам массива
            array.add(i);  // 3. заполняем массив цифрами от 1 до 10
        }

        System.out.println(array);  // 4. выводим массив
        System.out.println(array.size());  // 5. смотрим размер массива

        array.remove(5);  // 6. можно удалить элемент по индексу, размер массива уменьшится

        System.out.println(array);
        System.out.println(array.size());

        array.add(456);  // 7. добавляем новый элемент в массив
        array.add(678);
        // array.add("678");  // 8. другой тип элемента добавить в массив нельзя

        System.out.println(array);
        System.out.println(array.size());

    }
}
