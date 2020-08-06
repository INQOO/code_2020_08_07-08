package optionals;

import java.util.Optional;

public class Main3OrElseGet {
    public static void main(String[] args) {
        Optional<Year> year = Optional.of(new Year(2020));

        System.out.println(year.orElse(new Year(2019)));
        System.out.println(year.orElseGet(() -> new Year(2019)));
    }
}
