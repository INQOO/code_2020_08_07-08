package streams.assignments;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Collections.emptyList;

public class Assignment1 {
    public static void main(String[] args) {
        String[] words = new String[]{"yinqoo", "in", "yy", "y", "yellow", "cloudy", "yjavay"};
        // znajduje slowa ktore zaczynaja sie i koncza litera "y"
        // ponizsze powinno wypisac: [yy, y, yjavay]
        System.out.println(findY(words));
    }

    public static List<String> findY(String[] strings) {


      return Stream.of(strings)
                .filter(x -> x.startsWith("y"))
                .filter(x -> x.endsWith("y"))
                .collect(Collectors.toList());

    }

}
