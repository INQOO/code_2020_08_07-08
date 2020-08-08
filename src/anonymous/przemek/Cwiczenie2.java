package anonymous.przemek;

import lambda.FunctionalInterfaces;

import java.util.function.*;

public class   Cwiczenie2 {

    public static void main(String[] args) {
        String name = "inqoo";



        Predicate<String> startsWithI = s -> s.startsWith("i");
        System.out.println(startsWithI.test(name));

        UnaryOperator<String> douleInqoo = x -> x + x;
        System.out.println(douleInqoo.apply(name));


        Consumer<String> printName = z -> System.out.println(z);
        printName.accept(name);
    }













}
