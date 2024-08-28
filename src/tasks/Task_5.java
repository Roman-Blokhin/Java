// LinkedList - связанный список

package tasks;

import java.util.LinkedList;
import java.util.List;

public class Task_5 {
    public static void main(String[] args) {
        List<String> linList = new LinkedList<>();  // создаем связанный строковый список
        linList.add("Roman");
        linList.add("Rom");
        linList.add("R");

        System.out.println(linList);

        linList.add(1, "kuka-reka");  // доб. по индексу новый элемент, он расширяет список

        System.out.println(linList);

        // можно удалить конкретный элемент, можно все значения, у списков много встроенных методов
    }
}
