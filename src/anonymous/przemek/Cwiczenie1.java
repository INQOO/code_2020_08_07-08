package anonymous.przemek;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Cwiczenie1 {
    public static void main(String[] args) {
        int n = 5;
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj " + n + " liczb");
        List<Integer> listaxD = new ArrayList(n);
        for (int i = 0; i < n; i++){
            listaxD.add(skaner.nextInt());
        }
        System.out.println(listaxD);

        listaxD.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) return 1;
                if (o2 > o1) return -1;
                return 0;
            }
        });
        System.out.println(listaxD);

        listaxD.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) return -1;
                if (o2 > o1) return 1;
                return 0;
            }
        });
        System.out.println(listaxD);

        listaxD.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });

//        Collections.sort(listaxD);
//        System.out.println(listaxD);
//
//        Collections.reverse(listaxD);
//        System.out.println(listaxD);

    }
}
