// Работа с исключениями - проверяемые

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Les_22 {
    public static void main(String[] args) {

        File file = new File("text.txt");
        try {
            Scanner scan = new Scanner(file);  // при возникн. несуществующей операции, делаем исключение- кр. лампочка
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("Такого файла нет");
        } finally {  // блок finally выполняется всегда, если сработало исключение, и если нет
            System.out.println("finally выполняется всегда, если сработало исключение, и если нет");
        }
    }

    public void master() throws FileNotFoundException {  // второй способ обработки исключений

        File file_2 = new File("text.txt");
        Scanner scan = new Scanner(file_2);  // файла нет, но обрабатывается исключение - throws FileNotFoundException

    }
}
