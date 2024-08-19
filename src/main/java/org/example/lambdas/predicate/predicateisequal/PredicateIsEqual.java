package org.example.lambdas.predicate.predicateisequal;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
        //another example
        /**
         * In Java 8, the `Predicate` interface is a functional interface that represents a boolean-valued function of one argument. It is often used for filtering or matching purposes in streams or other contexts. The `isEqual` method in the `Predicate` interface is a static method that returns a predicate that tests if two arguments are equal.
         *
         * ### `Predicate.isEqual` Method:
         * - **Syntax:** `static <T> Predicate<T> isEqual(Object targetRef)`
         * - **Description:** This method returns a predicate that checks if its argument is equal to the specified object (`targetRef`) using `Objects.equals()`.
         *
         * ### Example:
         *
         * Let's say you want to filter a list of strings to find all elements that are equal to a specific string.
         *
         * ```java
         * import java.util.Arrays;
         * import java.util.List;
         * import java.util.function.Predicate;
         * import java.util.stream.Collectors;
         *
         * public class PredicateIsEqualExample {
         *     public static void main(String[] args) {
         *         List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Alice");
         *
         *         // Use Predicate.isEqual to create a predicate that checks if a string is equal to "Alice"
         *         Predicate<String> isEqualToAlice = Predicate.isEqual("Alice");
         *
         *         // Filter the list using the predicate
         *         List<String> filteredNames = names.stream()
         *                                           .filter(isEqualToAlice)
         *                                           .collect(Collectors.toList());
         *
         *         // Print the filtered list
         *         System.out.println(filteredNames); // Output: [Alice, Alice]
         *     }
         * }
         * ```
         *
         * ### Explanation:
         * - The `Predicate.isEqual("Alice")` method creates a predicate that checks if a given string is equal to `"Alice"`.
         * - The `filter(isEqualToAlice)` operation filters the list to include only those elements that match `"Alice"`.
         * - The result is a list containing only the strings that are equal to `"Alice"`.
         *
         * This method is particularly useful when you need a simple equality check as a predicate.
         */
        List<String> names = Arrays.asList("John", "Ak", "Daniel", "Steven", "Dana", "John");
        Predicate<String> isEqualsToJohn = Predicate.isEqual("John");
        List<String> filteredNames = names.stream().filter(isEqualsToJohn).collect(Collectors.toList());
        System.out.println(filteredNames);

    }
}
