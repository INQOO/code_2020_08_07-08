package lambda;

import java.util.Arrays;
import java.util.List;

public class Methods {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        for (int cokolwiek: numbers) {
            System.out.println(cokolwiek);
        }

//        numbers.forEach(number -> );
        numbers.forEach(cokolwiek -> System.out.println(cokolwiek));
        numbers.forEach(num -> System.out.println(num));
        numbers.forEach(System.out::println);
    }
}
