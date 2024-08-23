// ПЕРЕГРУЗКА МЕТОДОВ

package Les_20;

public class Bears extends Animal{

    public static void main(String[] args) {
        Bears one = new Bears();

        one.overLoad();  // обычный метод
        one.overLoad("Teddy");  // используем метод с перегрузкой
    }
}
