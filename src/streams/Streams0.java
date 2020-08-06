package streams;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Streams0 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = new LinkedList<Integer>().stream();

        Stream<Integer> stream2 = Arrays.stream(new Integer[]{});

        IntStream ints = IntStream.range(0, 123);
        LongStream longs = LongStream.generate(() -> 1L);

        IntStream randomInts = new Random().ints();
        randomInts.filter(n -> n < 100).filter(n -> n > 0).limit(10).forEach(System.out::println);
        // co tu jest nie tak?
//        randomInts.filter(n -> n < 100).filter(n -> n > 0).limit(10).collect(Collectors.toList());
    }
}
