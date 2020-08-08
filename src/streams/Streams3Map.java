package streams;

import streams.model.Employee;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams3Map {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Jack", 20, new BigDecimal(2500)),
                new Employee("Alex", 33, new BigDecimal(4500)),
                new Employee("Julia", 45, new BigDecimal(10_000))
        );

        List<String> names = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());

        employees.stream()
                .filter(x -> x.getAge() > 30)
                .filter(x -> x.getSalary().compareTo(BigDecimal.valueOf(5000)) == 1)
                .forEach(x -> System.out.println(x.getName() + " wiek: " + x.getAge() + "  wypłata: " + x.getSalary()));
    }
}
