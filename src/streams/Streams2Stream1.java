package streams;

import java.util.List;
import java.util.stream.Collectors;

public class Streams2Stream1 {

    public static void main(String[] args) {
        List<String> names = List.of("Kate", "John", "Sandra");

        names.forEach(x -> System.out.println(x));

        names.stream()
                .filter(name -> "Sandra".equals(name))
                .forEach(name -> System.out.println(name));

    }
}
