package anonymous.anonimus;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class KomparatorMG implements Comparator {
    private static Comparator<? super Integer> comparator;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        int number = 1;
        while (number <= 5) {
            System.out.println("Podaj liczbę" + number);
            numbers.add(scan.nextInt());
            number++;
        }
        System.out.println(numbers);
        numbers.sort(KomparatorMG.comparator);
        System.out.println(numbers);

    }



    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}

        /*Comparator<Integer> comparator = KomparatorMG()

        List<Integer> numbers = Arrays.asList(3, 5, 1, 4);
        numbers.sort(comparator);*/


