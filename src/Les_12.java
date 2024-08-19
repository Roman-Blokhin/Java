// Операторы continue и break

public class Les_12 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {  // остаток от деления = 0
                continue;  // пропускает четные цифры
            } else if (i > 51) {
                break;
            }
            System.out.println(i);
        }
    }
}
