// условные операторы switch - case

import java.util.Scanner;

public class les_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scan.nextInt();
        // ПРОВЕРКА НА ЧЕТКОЕ СОВПАДЕНИЕ, НА РАВЕНСТВО
        switch (num) {
            case 1:
                System.out.println("Число = 1");
                break;
            case 2:
                System.out.println("Число = 2");
                break;
            case 3:
                System.out.println("Число = 3");
                break;
            case 4:
                System.out.println("Число = 4");
                break;
            default:
                System.out.println("Такого числа нет");
                break;
        }
    }
}
