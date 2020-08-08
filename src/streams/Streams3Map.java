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

        List<String> names = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());

        employees.stream()
                .filter(x -> x.getAge() >= 30)
                .filter(z -> z.getSalary().compareTo(BigDecimal.valueOf(5000)) == 1) // (5000) > 0
                .forEach(y -> System.out.println(y.getName()));

        System.out.println(names);
    }
}
