package org.example.lambdas.predicate.predicateisequal;

import java.util.function.Predicate;

/**
 * isEqual(Object targetRef)
 * This method returns a predicate that tests if two arguments are equal
 * according to Objects.equals(Object, Object). This is not a chaining method.
 */
public class PredicateIsEqual {
    public static void main(String[] args) {
     Predicate<String> p1 = Predicate.isEqual("Hello");
     Predicate<String> p2 = s -> s.equals("Hello");
     System.out.println(Predicate.isEqual(p2).test(p1));

    }
}
