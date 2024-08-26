package org.example.streamapi.mapping;

/**
 * Understanding map()
 * The map() method takes a lambda expression as its only argument and uses it to change every individual element in the stream. Its return value is a new stream object containing the changed elements.
 *
 * Below is the method definition:
 *
 * <R> Stream<R> map(Function<? super T, ? extends R> mapper)
 * Input Parameter -> A function to apply to each element.
 *
 * Return Type -> Returns a stream consisting of the results of applying the given function to the elements of the stream.
 *
 * Let’s look at a basic example of map(). In the below example, we have a list of names. We need to print all the names on the list in the upper case.
 */

public class MappingDemo {
    public static void main(String[] args) {

    }
}
