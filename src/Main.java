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

        System.out.println();
        person_1.firstNameAndSecondName("Box", "Vita");  // используем метод, передаем 2 параметра

        System.out.println("--------------------------------");

        Test user_1 = new Test();  // создаем экземпляр класса Test
        System.out.println(user_1.getInfo());
        user_1.setInfo("cat");  // присваиваем новое значение через сеттер, потому что переменная приватная
        user_1.num = 5;  // присваиваем значение открыто
        System.out.println(user_1.getInfo());
        System.out.println(user_1.num);
        user_1.setInfo("root");  // меняем значение на новое
        System.out.println(user_1.getInfo());

        System.out.println("--------------------------------");

        User user_2 = new User(7, "toy");
        User user_3 = new User(70, "yuo");

        System.out.println(user_2.count);  // функция count считает все созданные экземпляры, из-за ефешс
        System.out.println(user_3.count);
    }
}