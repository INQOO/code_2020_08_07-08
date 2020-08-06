package streams;

import java.util.List;

public class Streams1 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 5, 3);

        System.out.println("Ile wszystkich liczb: " + numbers.size());

        long unique = numbers.stream().distinct().count();

        System.out.println("Unikalnych liczb: " + unique);
    }
}
