// Строковые массивы

public class Les_14 {
    public static void main(String[] args) {
        String[] words = {"Roman", "Daria", "Robert"};
        for (String word: words) {  // выводим элементы строкового массива - 1 способ
            System.out.print(word + " ");
        }

        System.out.println("\n---------------");

        for (int i = 0; i < words.length; i++) {  // выводим элементы строкового массива - 2 способ
            System.out.print(words[i] + " ");
        }

        System.out.println("\n---------------");

        words[0] = "Tort";  // заменяем элемент массива по индексу
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }

        // Это статический массив, в него мы не можем добавить новый элемент, так как изначально указываем размер
    }
}
