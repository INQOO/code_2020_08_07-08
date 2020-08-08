package streams;

import streams.model.Employee;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class Streams3Map {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Jack", 20, new BigDecimal(2500)),
                new Employee("Alex", 33, new BigDecimal(4500)),
                new Employee("Julia", 45, new BigDecimal(10_000))
        );

        // wypisz pracownikow:
        // majacych co najmniej 30 lat
        // zarabiajacych powyzej 5000

        employees.stream()
                .forEach(x -> System.out.println(x.getName()));

    }
}
