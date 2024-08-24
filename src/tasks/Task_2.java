package tasks;

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

    }
}
