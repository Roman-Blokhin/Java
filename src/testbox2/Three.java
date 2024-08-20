// Модификатор доступа - область видимости переменных

package testbox2;

public class Three {
    public static void main(String[] args) {
        // создаем экземпляр класса
        Two obj = new Two();// тип(класс) + название переменной + запрашиваем память для типа(класса)
        System.out.println(obj.defaultVar);  // потому что в этом пакете
        System.out.println(obj.protectedVar);  // потому что в этом же пакете
        System.out.println(obj.publicVar);  // потому что публичная
    }
}


// public - можем обращаться к переменной откуда угодно
// private - доступ только в данном классе
// protected - доступ только внутри пакета или в классах наследниках
// default - доступ на уровне этого пакета