package anonymous.lukasz;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Lambda {
    public static void main(String[] args) {
         String name = "inqoo";
         // lambda  czy string zaczyna sie od i
        // true
        //System.out.println(dubleInqoo()); // lambda ktora zwraca inqooinqoo
        //inqooinqoo
       // printName();// wypisze string name
        // inqoo
        Predicate<String> startWithI = x -> (x.startsWith("i"));
        System.out.println(startWithI.test(name));

       UnaryOperator<String> doubleInqoo = y -> y.concat(y);
       System.out.println(doubleInqoo.apply(name));

      Consumer<String> printName = z -> System.out.println(z);
      printName.accept(name);
    }
    public boolean checkIfStringStartWithI(String x){ // to samo co lambda wyżej
        return x.startsWith("i");
    }

}
