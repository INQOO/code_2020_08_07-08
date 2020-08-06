package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Streams4 {
    public static void main(String[] args) {
        List<String> studentNames = new ArrayList<>();
        studentNames.add("Kate");
        studentNames.add("   John");
        studentNames.add("Jack");
        studentNames.add("Mike");
        studentNames.add("Diane");
        studentNames.add("Juliette    ");
        studentNames.add("Jack");
        studentNames.add("Mike");

        List<String> newStudentNames = studentNames.stream()
                .distinct()
                .map(String::toUpperCase)
                .map(String::trim)
                .filter(name -> name.startsWith("J"))
                .collect(Collectors.toList());

        System.out.println(newStudentNames);
    }
}