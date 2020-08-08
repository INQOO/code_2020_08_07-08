package lambda;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FuncIntTraining {
    public static void main(String[] args) {
        String name = "inqoo";

        Predicate<String> startsWithI = x -> x.startsWith("i");
        UnaryOperator<String> doubleInqoo = x -> x + x;
        Supplier<String> printName = () -> name;

        System.out.println(doubleString(name));

        System.out.println(startsWithI.test(name));  // lambda sprawdzajacy czy string zaczyna sie od i
        System.out.println(doubleInqoo.apply(name)); // lambda ktora zwraca inqooinqoo
        System.out.println(printName.get());
    }

    public static boolean checkIfStringStartsWithI(String x) {
        return x.startsWith("i");
    }

    public static String doubleString(String x) {
        return x + x;
    }

    public static void printSomeString(String z) {
        System.out.println(z);
    }
}
