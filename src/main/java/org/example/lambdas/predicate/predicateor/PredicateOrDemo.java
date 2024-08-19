package org.example.lambdas.predicate.predicateor;

import java.util.function.Predicate;

class Employee {
    private String name;
    private int age;
    private int yearsOfService;

    public Employee(String name, int age, int yearsOfService) {
        this.name = name;
        this.age = age;
        this.yearsOfService = yearsOfService;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }
}
public class PredicateOrDemo {
    static boolean isEligibleForRetirement(Predicate<Employee> predicate, Employee employee) {
        return predicate.test(employee);
    }
    public static void main(String[] args) {
        Predicate<Employee> isGreaterThanSizty = e -> e.getAge() > 60;
        Predicate<Employee> thirtyYearsOfService = e -> e.getAge() == 30;
        Predicate<Employee> predicate = isGreaterThanSizty.or(thirtyYearsOfService);
        Employee e = new Employee("Ramalingam", 45,28);
        boolean isEligible = isEligibleForRetirement(predicate,e);
        System.out.println("IS ramalingam retired "+isEligible);
    }
}
