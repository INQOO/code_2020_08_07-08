package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams2Stream2 {

    public static void main(String[] args) {
        List<String> names = List.of("johN", "Kate", "John", "Sandra", "john", "JOHn");

        List<String> uppercase = new ArrayList<>();

        for (String name : names) {
            uppercase.add(name.toUpperCase());
        }

        System.out.println(uppercase);
        boolean isSandraInNames = names.stream().anyMatch(x -> "Sandra".equals(x));

        long johns = names.stream()
                .map(String::toLowerCase)
                .filter(john -> "john".equals(john))
                .count();



        System.out.println(johns);

//        names.stream().allMatch(x -> "Kate".equals(x));
//
//        System.out.println(isSandraInNames);
    }
}
