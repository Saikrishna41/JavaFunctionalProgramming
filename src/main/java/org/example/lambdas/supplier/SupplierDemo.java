package org.example.lambdas.supplier;

import org.example.lambdas.Person;

import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Supplier is an interface that does not take in any argument but produces a value when the get() function is invoked.
 * Suppliers are useful when we don’t need to supply any value and obtain a result at the same time.
 */
public class SupplierDemo {
    static boolean isEligibleForVoting(Supplier<Person> supplier, Predicate<Person> predicate) {
        return predicate.test(supplier.get());
    }
    public static void main(String[] args) {
        Supplier<Person> supplier = () -> new Person("Sai",17,"india");
        Predicate<Person> predicate = p -> p.getAge() >= 18;
        boolean isEligible = isEligibleForVoting(supplier, predicate);
        System.out.println("IS the person eligible for voting "+isEligible);
    }
}
