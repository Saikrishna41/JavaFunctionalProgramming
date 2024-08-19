package org.example.lambdas.comparator;


import org.example.lambdas.Person;
import org.example.lambdas.comparator.comparatorwithlambda.ComparatorServiceLambda;

import java.util.ArrayList;
import java.util.List;


public class ComparatorDemo {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Vikram",67,"india"));
        personList.add(new Person("Ajith",45,"india"));
        personList.add(new Person("Kashma",54,"india"));
        personList.add(new Person("Mitch",48,"india"));
        personList.add(new Person("Dan",41,"india"));
        System.out.println("before sorting");
        personList.stream().map(Person::getName).forEach(System.out::println);
       // PersonService.getPerson(personList);
        ComparatorServiceLambda.getPerson(personList);
        System.out.println("after sorting");
        personList.stream().map(Person::getName).forEach(System.out::println);


    }
}
