package anonymous.jacek;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class LambdaJacek {
    public static void main(String[] args) {
        String name = "inqoo";

//        startsWithI - lambda sprawdzająca czy zaczyna się od I
//        doubleInqoo - lambda zwraca inqooinqoo
//        printName - wypisze stringa name. Użyć consumera

        Predicate<String> startsWithI = z -> z.startsWith("i");
        UnaryOperator<String> doubleInqoo = z -> z.concat(z); // lub z + z
        Consumer<String> printName = z -> System.out.println(z);

        System.out.println(startsWithI.test(name));
        System.out.println(doubleInqoo.apply(name));
        printName.accept(name);


    }
}
