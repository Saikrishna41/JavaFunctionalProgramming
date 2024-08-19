package org.example.lambdas.comparator.comparatorwithlambda;

import org.example.lambdas.Person;

import java.util.Collections;
import java.util.List;

public class ComparatorServiceLambda {

    public static List<Person> getPerson(List<Person> personList) {
        Collections.sort(personList, (e1, e2) -> e1.getName().compareTo(e2.getName()));
        return personList;
    }
}
