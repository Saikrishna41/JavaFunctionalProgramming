package org.example.lambdas.predicate;

import org.example.lambdas.Person;

import java.util.function.Predicate;

/**
 * The Predicate<T> interface has an abstract method boolean test(T t).
 * Basically, a predicate is a function that evaluates the given input and returns true or false.
 * We have a PredicateDemo class, which has a method isPersonEligibleForVoting(). This method takes in a person object and a predicate as a parameter.
 * The predicate is evaluated to check if the given person is eligible for voting or not.
 */
public class PredicateDemo {
    static boolean isPersonEligibleForVoting(Person person, Predicate<Person> predicate) {
        return predicate.test(person);
    }
    public static void main(String[] args) {
        Person person = new Person("Akram",22,"India");
        Predicate<Person> predicate = p -> p.getAge() >= 18;
        boolean isEligibleForVoting = isPersonEligibleForVoting(person,predicate);
        System.out.println("is eligible? "+isEligibleForVoting);
    }
}
