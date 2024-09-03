package OOPS;

/**
 * InnerInterfaceExample
 */
interface Animal {
    void sound();

    void sleep();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("This dog Barks");
    }

    public void sleep() {
        System.out.println("This Dog sleeps to");
    }
}

public class InterfaceExample {
    public static void main(String args[]) {
        Dog myDog = new Dog();
        myDog.sound();
        myDog.sleep();
    }
}
