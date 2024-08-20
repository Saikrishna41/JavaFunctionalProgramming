package org.example.lambdas.function.andthenfunction;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * This method returns a composed function that first applies the function on which
 * it is called on the input, and then applies the function provided as parameter, to the result.
 */
public class AndThenDemo {
    public static void main(String[] args) {
        Function<Integer, Integer> add = x -> x + 10;
        Function<Integer, Integer> multiply = y -> y * 2;
        System.out.println("output for andthen is "+add.andThen(multiply).apply(3));
    }
}
