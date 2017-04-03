class Machine {
    private String name;
    private int code;

    public Machine() {
        this("Arnie", 0); // call constructor
        System.out.println("Constructor running.");
    }

    public Machine(String name) { // works like a set method. if argument passed in, Java looks for constructor that passes in string.
        System.out.println("Second constructor running.");
        this.name = name;
    }

    public Machine(String name, int code) {
        System.out.println("Third constructor running.");
        this.name = name;
        this.code = code;
    }
}

public class App {

    public static void main(String[] args) {

        Machine machine1 = new Machine();

        Machine machine2 = new Machine("Bertie");

        Machine machine3 = new Machine("Arnie", 7);

    }
}