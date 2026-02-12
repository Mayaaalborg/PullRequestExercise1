

public class Main {

    public static void main(String[] args) {

        String name = "Maya";
        int age = 24;

        System.out.println("Hello, my name is " + name);
        System.out.println("I am " + age + " years old.");

        System.out.println("Counting to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        greet("Welcome to the project!");
    }

    public static void greet(String message) {
        System.out.println(message);
    }
}