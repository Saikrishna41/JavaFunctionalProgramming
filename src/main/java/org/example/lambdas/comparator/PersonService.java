package org.example.lambdas.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.example.lambdas.Person;

public class PersonService {
    public static List<Person> getPerson(List<Person> personList) {
         Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
         return personList;
    }
}
