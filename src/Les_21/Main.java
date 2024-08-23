// ИНТЕРФЕЙСЫ - ОПРЕДЕЛЕНИЕ МЕТОДОВА БЕЗ ИХ РЕАЛИЗАЦИИ
// implements - УКАЗАНИЕ ОБ ИСПОЛЬЗОВАНИЕ ИНТЕРФЕЙСОВ

package Les_21;

public class Main {
    public static void main(String[] args) {
        Butterfly krako = new Butterfly();
        Plain il24 = new Plain();

        // используем один и тот же метод(интерфейс), но реализация подтягивается из разных классов
        krako.fly();
        il24.fly();
    }
}
