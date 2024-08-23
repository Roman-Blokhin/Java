// ПЕРЕГРУЗКА МЕТОДОВ

package Les_20;

public class Animal {

    public void overLoad(){  // создали один метод с выводом какой-либо информации
        System.out.println("Empty");
    }

    public void overLoad(String name) {  // создали такой же метод только с перегрузкой, есть атрибут name
        System.out.println("Имя: " + name);
    }

}
