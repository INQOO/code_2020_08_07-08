package anonymous.jacek;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class JacekComparator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Set a number: ");
            numbers.add(scanner.nextInt());
        }
        System.out.println("Your numbers are: " + numbers);

        numbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) return 1;
                if (o1 < o2) return -1;
                else
                    return 0;
            }
        });

        System.out.println("The order from the lowest is: " + numbers);

        numbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) return -1;
                if (o1 < o2) return 1;
                else
                    return 0;
            }
        });

        System.out.println("The order from the biggest is: " + numbers);
    }
}
