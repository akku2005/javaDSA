package JavaBasics;

public class PracticeSide {

    static class Pen {
        String color;
        int tip;
    }

    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.color = "Red";
        System.out.println(p1.color);
    }
}