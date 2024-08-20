package org.example.lambdas.function.bifunction;

import java.util.function.BiFunction;

/**
 * BiFunction<T,U,R>
 * The BiFunction<T, U, R> is similar to Function<T, R> interface;
 * the only difference is that the BiFunction interface takes in two parameters and
 * returns an output.
 *
 * Below is the list of methods in the BiFunction interface.
 */
public class Bifunctindemo {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
        System.out.println("sum of the two numbers are "+sum.apply(22,32));
    }
}
