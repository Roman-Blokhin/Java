// Модификатор доступа - область видимости переменных

package testbox1;

import testbox2.Two;

public class One extends Two {  // extends Two - наследуемся от класса из другого пакета
    public static void main(String[] args) {
        Two obj = new Two();// тип(класс) + название переменной + запрашиваем память для типа(класса)
        System.out.println(obj.publicVar);  // потому что публичная
    }

    public void testProtected () {
        System.out.println(protectedVar);  // получаем доступ к классу из другого пакета, потому что наследуемся
    }
}


// public - можем обращаться к переменной откуда угодно
// private - доступ только в данном классе
// protected - доступ только внутри пакета или в классах наследниках
// default - доступ на уровне этого пакета