class Person {

    String name;
    int age;

}

public class App {

/*   error message: Exception in thread "main" java.lang.ClassNotFoundException: com.company.Main
     resolved via editing run/debug configuration and editing "Main class" field to point to App
     instead of com.company.App:
     http://stackoverflow.com/questions/41916575/error-class-not-found-in-intellij-ide-on-mac
     */
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Joe Bloggs";
        person1.age = 37;

        Person person2 = new Person();
        person2.name = "Sarah Smith";
        person2.age = 20;

        System.out.println(person1.name);

    }
}