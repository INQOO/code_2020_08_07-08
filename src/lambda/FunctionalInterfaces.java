package lambda;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        // metoda get, nie przyjmuje parametrów i zwraca instację klasy T (w tym przypadku String)
        Supplier<String> someString = () -> "some return value";

        // metoda apply, która przyjmuje instancję klasy T (tutaj Integer) i zwraca klasę R (tutaj Long)
        Function<Integer, Long> multiline = x -> {
            if (x != null && x % 2 == 0) {
                return (long) x * x;
            }
            else {
                return 123L;
            }
        };

        // specyficzna implementacja interfejsu Function - typ argumentu i typ zwracany są takie same
        UnaryOperator<Integer> square = x -> x * x;

        // metoda test, która przyjmuje instancję klasy T i zwraca flagę (boolean)
        Predicate<String> startsWithNumberOne = s -> s.startsWith("1");
    }
}
