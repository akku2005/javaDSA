package Java8Features;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpression {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Akash");
        names.add("Om");
        names.forEach(name -> System.out.println(names));
    }
}
