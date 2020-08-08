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

        List<Integer> numbers = new ArrayList<>();
//        numbers.sort(comparator);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("podaj liczbe " + (i + 1));

            numbers.add(Integer.valueOf(scanner.nextLine()));
        }
        System.out.println(numbers.toString());
//        Collections.sort(numbers);
//        System.out.println(numbers.toString());
//        Collections.reverse(numbers);
//        System.out.println(numbers.toString());

        numbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) return -1;
                if (o1 < o2) return 1;
                return 0;
            }
        });
    }
}