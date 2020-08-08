package anonymous.lukasz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainComparator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            System.out.println("podaj liczbe");
            numbers.add(scanner.nextInt());
        }
        System.out.println(numbers);

      /*  numbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) return 1;
                if (o1 < o2) return -1;
                return 0;
            }
        });

       */
        numbers.sort((o1, o2) -> { // lambda
            if (o1 > o2) return 1;
            if (o1 < o2) return -1;
            return 0;
        });

        System.out.println(numbers);

        numbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) return -1;
                if (o1 < o2) return 1;
                return 0;
            }
        });
        System.out.println(numbers);
    }
}

