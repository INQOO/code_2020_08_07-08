package streams;

import streams.model.Employee;

import java.math.BigDecimal;
import java.util.Collection;
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

        System.out.println(names);

        employees.stream()
                .filter(x -> x.getAge() >= 20)
                .filter(x -> x.getSalary().compareTo(BigDecimal.valueOf(3000)) > 0) //może teżbyć ==1
//                .forEach(x -> System.out.println(x.getName()));
                .forEach(x -> System.out.println(x.getName() + " wiek " + x.getAge() + " wynagrodzenie " + x.getSalary()));
        }
}
