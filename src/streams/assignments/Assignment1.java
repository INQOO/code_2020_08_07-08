package streams.assignments;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.emptyList;

public class Assignment1 {
    public static void main(String[] args) {
        String[] words = new String[]{"yinqoo", "in", "yy", "y", "yellow", "cloudy", "yjavay"};
        // ponizsze powinno wypisac: [yy, y, yjavay]
        System.out.println(findY(words));
    }

    public static List<String> findY(String[] strings) {
        return emptyList();
    }

}
