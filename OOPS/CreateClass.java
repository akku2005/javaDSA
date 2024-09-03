package OOPS;

class Car {
    String color;
    String model;
    int year;

    void displayDetails() {
        System.out.println("Model: " + model + ", Color: " + color + ", Year: " + year);
    }
}

public class CreateClass {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.model = "New AR 20010";
        myCar.year = 2024;

        // Calling method
        myCar.displayDetails();
    }
}
