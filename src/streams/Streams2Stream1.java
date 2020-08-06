package streams;

import java.util.List;
import java.util.stream.Collectors;

public class Streams2Stream1 {

    public static void main(String[] args) {
        List<String> names = List.of("Kate", "John", "Sandra");

        List<String> sandras = names.stream()
                .filter(name -> "Sandra".equals(name))
                .collect(Collectors.toList());

        boolean isSandraInNames = !sandras.isEmpty();
        System.out.println(isSandraInNames);
    }
}
