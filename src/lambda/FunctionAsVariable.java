package lambda;

import java.math.BigDecimal;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionAsVariable {
    public static void main(String[] args) {
//        BiFunction<Integer, Integer, String> printNumbers =
//                (value1, value2) -> "Liczby to: " + value1 + " i " + value2;
//
//        System.out.println(printNumbers.apply());

        BiFunction<Double, String, Long> adderToLong = (d, s) -> {
            System.out.println("jestem w adderToLong");
            long a = (long) (d + Long.parseLong(s));
            System.out.println("Liczba " + a);
            return a;
        };

        Function<Long, BigDecimal> bigDecimalConverter = l -> {
            System.out.println("Jestem w bigDecimalConverter");
            BigDecimal cos = BigDecimal.valueOf(l);
            System.out.println(cos);
            return cos;
        };

        BiFunction<Double, String, BigDecimal> biFunction = adderToLong
                .andThen(bigDecimalConverter);

        BigDecimal bd = biFunction.apply(20.33d, "34");
        System.out.println(bd);
    }
}
