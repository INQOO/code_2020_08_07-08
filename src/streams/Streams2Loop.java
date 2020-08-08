package streams;

import java.util.List;

public class Streams2Loop {

    public static void main(String[] args) {
        List<String> names = List.of("Kate", "John", "Sandra");


        for (String name : names) {
            if ("Sandra".equals(name)) {
                System.out.println(name);
                break;
            }
        }

    }
}
