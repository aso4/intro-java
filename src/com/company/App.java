class Person {

    String name;
    int age;

    void speak() {
        System.out.println("Hello, my name is " + name + ", I'm " + age + " years old.");
    }
}

public class App {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Joe Bloggs";
        person1.age = 37;
        person1.speak();

        Person person2 = new Person();
        person2.name = "Sarah Smith";
        person2.age = 20;
        person2.speak();

    }
}