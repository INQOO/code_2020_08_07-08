package anonymous.przemek;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Cwiczenie11 {
    public static void main(String[] args) {
        System.out.println("Ile wyrazów do posortowania?");
        int n = 5;
        Scanner skaner = new Scanner(System.in);

        System.out.println("Podaj " + n + " słów");
        List<String> listaxD = new ArrayList(n);
        for (int i = 0; i < n; i++) {
            listaxD.add(skaner.next());
        }
        System.out.println(listaxD);

        listaxD.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length()) return -1;
                if (o1.length() > o2.length()) return 1;
                return 0;
            }
        });
        System.out.println(listaxD);

        listaxD.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return -1;
                if (o1.length() < o2.length()) return 1;
                return 0;
            }
        });
        System.out.println(listaxD);


    }
}
