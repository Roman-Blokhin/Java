// МАТЕМАТИЧЕСКИЕ ДАННЫЕ

public class les_3 {
    public static void main(String[] args) {
        int num1 = 50, num2 = 100, res;
        res = num1 + num2;
        System.out.println(res);

        float num4 = 33, num3 = 50, res2, res3, res4 = 1, res5 = 2, res6 = 7;
        res2 = num4 / num3;
        res3 = num3 % num4;  // остаток при делении
        System.out.println(res2);
        System.out.println(res3);

        res4++;  // добавляет 1
        res5--;  // вычитает 1
        res6 *=10;  // сокращенная запись вычисления, можно делать со всеми знаками
        System.out.println(res4);
        System.out.println(res5);
        System.out.println(res6);
    }
}
