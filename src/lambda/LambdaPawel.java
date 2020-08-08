package lambda;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class LambdaPawel {
    public static void main(String[] args) {
        String name = "inqoo";

        Predicate<String> starsWithI = s -> s.startsWith("i");
        UnaryOperator<String> doubleInqoo = x -> x + x;
        Consumer<String> printName = System.out::println;

        System.out.println(starsWithI.test(name)); // lambda sprawdzajacy czy string zaczyna się od i
        System.out.println(doubleInqoo.apply(name)); // lambda ktora zwraca inqooinqoo
        printName.accept(name);
    }
}
