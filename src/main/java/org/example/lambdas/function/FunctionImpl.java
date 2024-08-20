package org.example.lambdas.function;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Function is a category of functional interfaces that takes an object of type T and
 * returns an object of type R.
 *
 * Until now, the functional interfaces that we’ve discussed have either not taken any
 * argument(Supplier), not returned any value(Consumer), or returned only a boolean(Predicate).
 *
 * Function interfaces are very useful as we can specify the type of input and output.
 *
 * Below are some of the interfaces that fall in this category.
 *
 * Function<T, R>
 * The function takes only one argument of type T and returns a result of type R.
 *
 * The following is the list of all the methods in the Function<T, R> interface.
 */
public class FunctionImpl {
    public static void main(String[] args) {
       Function<String, Integer> lengthFunction = (s) -> s.length();
        System.out.println("Length of the given string is "+lengthFunction.apply("PremilaRamalingam"));
    }
}
