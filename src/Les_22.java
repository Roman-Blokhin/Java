// Работа с исключениями

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Les_22 {
    public static void main(String[] args) {

        File file = new File("text.txt");
        try {
            Scanner scan = new Scanner(file);  // при возникн. несуществующей операции, делаем исключение- кр. лампочка
        } catch (FileNotFoundException e) {
            System.out.println("Такого файла нет");
        }

    }
}
