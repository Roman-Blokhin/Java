// ДЖЕНЕРИКИ

public class Les_24 {
    public static void main(String[] args) {

        // 3. создаем экземпляры класса, проставляем нужный нам тип
        Box<Integer> age = new Box<>();
        Box<String> name = new Box<>();

        name.setInfo("Roman");  // 4. присваиваем значение через сеттер
        age.setInfo(18);

        System.out.println("Пользователь: " + name.getInfo() + ". Возраст: " + age.getInfo());

    }
}

class Box <T> {  // 1. <T> - любой ссылочный тип можно вложить для динамичности класса
    private T info;

    // 2. создаем геттер и сеттер
    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }
}

