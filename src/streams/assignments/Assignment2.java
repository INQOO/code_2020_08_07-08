package streams.assignments;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Assignment2 {
    public static void main(String[] args) {
        Set<String> words = Set.of("asdf", "java", "inqoo", "INQOO");
        // ponizsze:
        // usunie duplikaty (zakladamy ze inqoo to to samo co INQOO)
        // zamieni kazde slowo na duze litery
        // do kazdego slowa dopisze *
        // wypisze te slowa (metoda ma wypisywac, NIE zwracac)
        starsWithoutDuplicates(words);
    }

    public static void starsWithoutDuplicates(Set<String> words) {

        words.stream()
                .map(String::toUpperCase)
                .distinct()
                .map((y -> y.concat("*")))
//                .collect(Collectors.toList())
                .forEach(y -> System.out.println(y));


    }
}
