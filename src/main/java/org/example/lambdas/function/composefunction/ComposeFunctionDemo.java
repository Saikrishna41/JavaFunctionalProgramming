package org.example.lambdas.function.composefunction;

import java.util.function.Function;

/**
 * Returns a composed function that first applies the function provided as a parameter
 * on the input, and then applies the function on which it is called, to the result.
 */
public class ComposeFunctionDemo {
    public static void main(String[] args) {
        Function<Integer, Integer> increment = x -> x + 10;
        Function<Integer, Integer> multiply = y -> y  * 2;
        System.out.println("compose result "+increment.compose(multiply).apply(3)); // output 16
    }
}
