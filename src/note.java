import java.util.Scanner;

public class note {
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Архив");
            System.out.println("2. Заметки");
            System.out.println("3. План");
            System.out.println("4. Новости");
            System.out.println("5. Выход");

            System.out.print("Выберите действие: ");
            Scanner scan = new Scanner(System.in);
            int info = scan.nextInt();

            if (info == 1) {
                System.out.println("\n1. Новое");
                System.out.println("2. Старое");
                System.out.println("3. ");
                System.out.println("4. Назад");
                System.out.println("5. Выход");

                System.out.print("\nВыберите действие: ");
                int num = scan.nextInt();
                if (num == 1){
                    System.out.println("\nСегодня вам расскажем про новое ..");
                    System.out.print("\nДля возврата наберите 0: ");
                    int num_1 = scan.nextInt();
                } else if (num == 2){
                    System.out.println("\nЗдесь будет старое ..");
                    System.out.print("\nДля возврата наберите 0: ");
                    int num_1 = scan.nextInt();
                } else if (num == 5){
                    System.out.println("\nПрограмма закончена.");
                    break;
                } else {
                    System.out.println(" ");
                }
            } else if (info == 2) {
                System.out.println("\n1. Походы с палаткой");
                System.out.println("2. Восхождения");
                System.out.println("3. Морские путешествия");
                System.out.println("4. Назад");
                System.out.println("5. Выход");

                System.out.print("\nВыберите действие: ");
                int num = scan.nextInt();
                if (num == 5){
                    System.out.println("\nПрограмма закончена.");
                    break;
                } else {
                    System.out.println(" ");
                }
            } else if (info == 3) {
                System.out.println("\n1. Создать маршрут");
                System.out.println("2. Продумать отпуск");
                System.out.println("3. Купить оборудование");
                System.out.println("4. Назад");
                System.out.println("5. Выход");

                System.out.print("\nВыберите действие: ");
                int num = scan.nextInt();
                if (num == 5){
                    System.out.println("\nПрограмма закончена.");
                    break;
                } else {
                    System.out.println(" ");
                }
            } else if (info == 4) {
                System.out.println("\n1. Получение визы");
                System.out.println("2. ");
                System.out.println("3. ");
                System.out.println("4. Назад");
                System.out.println("5. Выход");

                System.out.print("\nВыберите действие: ");
                int num = scan.nextInt();
                if (num == 5){
                    System.out.println("\nПрограмма закончена.");
                    break;
                } else {
                    System.out.println(" ");
                }
            } else {
                System.out.println("Конец задачи..");
                break;
            }
        }
    }
}
