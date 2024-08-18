// Проверяем конструкцию switch-case

public class Les_7 {
    public static void main(String[] args) {
        int num = 1;

        String name = switch (num) {  // создаем переменную name, проверяем, если num == 1, присваиваем новое значение
            case 1 -> "One";
            default -> "Default";
        };
        System.out.println(name);
    }
}
