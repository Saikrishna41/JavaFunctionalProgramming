package org.example.lambdas.predicate.bipredicate;

import org.example.lambdas.Person;

import java.util.function.BiPredicate;

public class BipredicateDemo {

    static boolean isPersonEligibleForVoting(BiPredicate<Person, Integer> predicate, Person person, int age) {
        return predicate.test(person,age);
    }
    public static void main(String[] args) {
        BiPredicate<Person, Integer> predicate = (person, minAge) -> {
            return person.getAge() >= 18;
        };
        Person john = new Person("John", 12,"USA");
        boolean isEligible = isPersonEligibleForVoting(predicate, john,32 );
        System.out.println("Is john eligible "+isEligible);

    }
}


