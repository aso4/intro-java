class Frog {
    private String name; // can't access outside class. encapsulation enforced.
    private int age;

    public void setName(String name) {
        this.name = name; // reference to object you're in. only need it when there's ambiguity.
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setInfo(String name, int age) {
        setName(name);
        setAge(age);
    }
}

public class App {

    public static void main(String[] args) {

        Frog frog1 = new Frog();
        frog1.setAge(1);
        frog1.setInfo("Ben", 12);

        System.out.println(frog1.getName());
        System.out.println(frog1.getAge());
    }
}