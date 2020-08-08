package streams;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Streams0 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = new LinkedList<Integer>().stream();

        List<Integer> numbers = List.of(1, 2, 3);
        Stream<Integer> stream = numbers.stream();

        Stream<Integer> stream2 = Arrays.stream(new Integer[]{});

        IntStream ints = IntStream.range(1, 3);
        LongStream longs = LongStream.generate(() -> 1L);

        List<String> names = List.of("inqoo", "java", "streamy");

        names.stream()
                .filter(x -> x.startsWith("j"))
                .collect(Collectors.toList());





        IntStream randomInts = new Random().ints(10, 1, 11);
//        long numberOfRandomInts = randomInts
//                .filter(x -> x >= 1)
//                .filter(x -> x < 20)
//                .filter(x -> x % 2 == 0)
//                .count();

        List<Integer> integerList = randomInts
                .boxed()
                .collect(Collectors.toList());

        System.out.println(integerList);
//        System.out.println(numberOfRandomInts);


//        randomInts.filter(n -> n < 100).filter(n -> n > 0).limit(10).forEach(System.out::println);
        // co tu jest nie tak?
//        randomInts.filter(n -> n < 100).filter(n -> n > 0).limit(10).collect(Collectors.toList());
    }
}
