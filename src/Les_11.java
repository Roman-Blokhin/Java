// Цикл foreach - цикл для работы с массивами

public class Les_11 {
    public static void main(String[] args) {
        int[] array = new int[10];  // создаем числовой массив из 10 чисел
        for (int number: array) {
            System.out.println(number);
        };

        System.out.println("---------");

        String[] strArray = new String[5];
        for (String str: strArray){
            System.out.println(str);
        }
    }
}
