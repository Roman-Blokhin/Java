// Объекты
// Создаем класс, где указываем два свойства для нашего объекта

public class User {

    private String name;  // 1. делаем нашу переменную приватной, работает только внутри этого класса
    int age;


    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // 2. создаем геттер и сеттер, чтобы приватная переменная могла использоваться и изменяться в других классах
    public String getName() {  // использует его
        return name;
    }

    public void setName(String name) {  // устанавливает новое значение имени
        this.name = name;
    }

    public void firstNameAndSecondName(String name, String surName) {  // создали метод, получающий параметры
        System.out.println("Ваше имя: " + name);
        System.out.println("Ваша фамилия: " + surName);
    }
}
