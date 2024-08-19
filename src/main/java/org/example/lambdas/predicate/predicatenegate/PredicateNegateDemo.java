package org.example.lambdas.predicate.predicatenegate;

import java.util.function.Predicate;

/**
 * This method returns a predicate that represents the logical negation of the predicate
 * it is called on.
 *
 * Suppose we have a Predicate defined, but in some areas, we need to negate that predicate.
 * In that case, we can use negate().
 *
 * In the below example, we have a predicate that checks if a number is greater than 10.
 * However, we need to check if a number is less than 10. Now instead of writing a new predicate
 * , we can negate the predicate we already have.
 */
public class PredicateNegateDemo {
    static boolean isNumberLessThanTen(Predicate<Integer> predicate) {
        return predicate.negate().test(14);
    }

    public static void main(String[] args) {
        Predicate<Integer> predicate = p -> p > 10;
        boolean isLessThanTen = isNumberLessThanTen(predicate);
        System.out.println("Is number less than ten "+isLessThanTen);
    }
}
