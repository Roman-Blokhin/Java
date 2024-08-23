// ИНТЕРФЕЙСЫ - ОПРЕДЕЛЕНИЕ МЕТОДОВА БЕЗ ИХ РЕАЛИЗАЦИИ
// implements - УКАЗАНИЕ ОБ ИСПОЛЬЗОВАНИЕ ИНТЕРФЕЙСОВ

package Les_21;

public class Plain implements Flyable{  // говорим, что мы хотим использовать интерфейс

    @Override  // подключаемся к интерфейсу, меняя его реализацию
    public void fly() {
        System.out.println("Летит самолет");
    }
}
