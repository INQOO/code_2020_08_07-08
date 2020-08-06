package lambda;

import java.util.function.BiFunction;

public class FunctionAsVariable {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sum = (value1, value2) -> value1 + value2;
        Integer result = sum.apply(1, 2);
        System.out.println(result);
    }
}
