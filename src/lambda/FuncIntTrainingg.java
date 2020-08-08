package lambda;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FuncIntTrainingg {
    public static void main(String[] args) {
        String name = "inqoo";


        Predicate<String> startWithI = s -> s.startsWith("i");

        System.out.println(startWithI.test(name));

        UnaryOperator<String> doubleInqoo = x -> x + x ;

        System.out.println(doubleInqoo.apply(name));

        Consumer<String> printName = x -> System.out.println(x);

        printName.accept(name);
    }
}
