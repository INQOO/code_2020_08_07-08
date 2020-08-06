package streams;

import java.util.List;

public class Streams2Loop {

    public static void main(String[] args) {
        List<String> names = List.of("Kate", "John", "Sandra");

        boolean isSandraInNames = false;

        for (String name : names) {
            if ("Sandra".equals(name)) {
                isSandraInNames = true;
                break;
            }
        }

        System.out.println(isSandraInNames);
    }
}
