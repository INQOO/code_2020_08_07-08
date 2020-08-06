package streams;

import java.util.List;

public class Streams2Stream2 {

    public static void main(String[] args) {
        List<String> names = List.of("Kate", "John", "Sandra");

        boolean isSandraInNames = names.stream().anyMatch("Sandra"::equals);

        System.out.println(isSandraInNames);
    }
}
