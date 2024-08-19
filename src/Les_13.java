// Числовые массивы

public class Les_13 {
    public static void main(String[] args) {
        int[] intArray = new int[20];
        for (int i = 0; i < intArray.length; i++) { // указываем длину массива
            intArray[i] = i;  // присваиваем каждому индексу массива значение этого индекса
            System.out.print(intArray[i] + " ");  // выводим каждый элемент по его индексу
        };

        System.out.println("\n---------------");

        for (int i = 0; i < intArray.length; i++) {
            if(i % 2 == 0) {  // выводим нечетный массив по индексу
                continue;
            }
            System.out.print(intArray[i] + " ");
        }

        System.out.println("\n---------------");

        for (int i = 0; i < intArray.length; i++) {
            if(i % 2 == 1) {  // выводим четный массив по индексу
                continue;
            }
            System.out.print(intArray[i] + " ");
        }
    }
}
