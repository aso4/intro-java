class Robot {
    public void speak(String text) {
        System.out.println(text);
    }
    public void jump(int height) {
        System.out.println("Jumping " + height + " feet.");
    }
    public void move(String direction, double distance) {
        System.out.println("Moving " + distance + " meters in direction " + direction + ".");
    }
}

public class App {

    public static void main(String[] args) {

        Robot sam = new Robot();
        sam.speak("I'm Sam");
        sam.jump(20);
        sam.move("West", 12.2);
    }
}