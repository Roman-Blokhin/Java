// Модификатор доступа - область видимости переменных

package testbox2;

public class Two {
    public int publicVar = 1;  // доступ отовсюду получаем
    protected int protectedVar = 2;
    int defaultVar = 3; // default - на уровне пакета доступ
    private int privateVar = 4;

}


// public - можем обращаться к переменной откуда угодно
// private - доступ только в данном классе
// protected - доступ только внутри пакета или в классах наследниках
// default - доступ на уровне этого пакета