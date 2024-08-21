// 1. создаем главный класс, с названием файла
public class Main {
    // 2. создаем главную функцию для запуска программы
    // 3. будем использовать класс для создания персонажа из другого файла
    public static void main(String[] args) {
        User person_1 = new User(45, "Robert");  // обязательный ввод при создании персонажа
        System.out.println("Создан персонаж: " + person_1.getName() + ". Возраст: " + person_1.age);

        person_1.age = 32;  // изменение возраста персонажа

        System.out.println(person_1.getName());  // получаем и выводим имя из приватной переменной

        person_1.setName("Daria");  // устанавливаем новое имя через метод сеттер

        System.out.println("Персонаж изменен: " + person_1.getName() + ". Возраст: " + person_1.age);




    }
}