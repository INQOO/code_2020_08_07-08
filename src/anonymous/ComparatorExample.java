package anonymous;

import java.util.*;

public class ComparatorExample {
    public static void main(String[] args) {
        // 1. Pobierz od użytkownika 5 liczb (w pętli) i zapisz je do zmiennej typu List<Integer>
        // 2. Posortuj liczby od najmniejszej do największej za pomocą metody sort (zaimplementuj swój własny Comparator jako klasę anonimową)

        List<Integer> integers = Arrays.asList(3, 2, 8, 8, 1);


        String name = "Olaf";

        System.out.println(name != "Olaf" ? "nieolaf" : "olaf");
        if(name != "Olaf") {
            System.out.println("nieolaf");
        } else {
            System.out.println("olaf");
        }



        integers.sort((a, b) -> {
            if (a < b) return -1;
            if (a > b) return 1;
            return 0;
        });
        System.out.println(integers);

//        Comparator<Integer> comparator = ??? co dalej?

//        List<Integer> numbers = Arrays.asList(3, 5, 1, 4);
//        numbers.sort(comparator);
    }
}
