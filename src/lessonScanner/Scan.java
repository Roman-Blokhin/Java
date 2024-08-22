package lessonScanner;

public class Scan {

    String name;
    int age;

    public Scan(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void newUser() {
        System.out.println("Ваше имя: " + name);
        System.out.println("Ваш возраст: " + age);
    }
}
