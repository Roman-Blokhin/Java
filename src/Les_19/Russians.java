// ПЕРЕОПРЕДЕЛЕНИЕ МЕТОДОВ

package Les_19;

public class Russians extends People {

    @Override  // переопределение метода в родительском классе, вызывается правой кнопкой мыши
    public void makeSound() {
        System.out.println("Bla-bla-bla");  // поменяли значение на новое
    }

    public static void main(String[] args) {
        Russians one = new Russians();  // результат после изменения метода у дочернего класса
        one.makeSound();

        People two = new People();  // вывод метода родительского класса
        two.makeSound();
    }
}
