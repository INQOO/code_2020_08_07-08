package lambda;
//codecauple
// java function interfaces
import javax.xml.namespace.QName;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FuncIntTrain {
    public static void main(String[] args) {
        String name = "inqoo";
        // true
        //Consumer<String> name = "inqoo" ->Object startsWith;
        //startsWith
        Predicate<String> startsWithi = s -> s.startsWith("i");
        System.out.println(startsWithi.test(name));
        //System.out.println(doubleInqoo.apply(name));
        //System.out.println(name.startsWith("i")); // lambda sprawdzająca czy string zaczyna się od i

        System.out.println(doubleInqoo()); // lambda która zwraca inqooinqoo
        //"inqoo"
        //String name -> name*name;

        //Consumer<String> c = ("inqoo") -> System.out.println("inqoo");
        //c.accept("inqoo");
        //Consumer<QName> = print.name(); //wypisze stringa name
    }

    private static String doubleInqoo() {
        return "inqooinqoo";

    }
}
