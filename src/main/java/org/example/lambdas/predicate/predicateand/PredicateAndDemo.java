package org.example.lambdas.predicate.predicateand;

import org.example.lambdas.Person;

import java.time.Period;
import java.util.function.Predicate;

/**
 * a) and(Predicate other)
 * This method returns a composed predicate that represents a short-circuiting logical AND of this predicate and another.
 *
 * In the below example, we need to check if a person is eligible for club membership.
 * The criteria is that the person’s age should be more than 18 and less than 60.
 *
 * We have created two predicates and then combined them into a single predicate using and() method.
 */
public class PredicateAndDemo {

    static boolean isEligibleForMembership(Person person, Predicate<Person> predicate) {
        return predicate.test(person);
    }
    public static void main(String[] args) {
        Predicate<Person> greaterThanEighteen = (p) -> p.getAge() >= 18;
        Predicate<Person> lessThanSixty = (p) -> p.getAge() <= 60;
        Predicate<Person> predicate = greaterThanEighteen.and(lessThanSixty);
        Person sai = new Person("Sai", 33, "aus");
        boolean isEligible = isEligibleForMembership(sai,predicate);
        System.out.println("Is sai eligible for membership "+isEligible);
    }
}
