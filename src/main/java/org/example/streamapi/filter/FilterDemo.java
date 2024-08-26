package org.example.streamapi.filter;


import java.util.ArrayList;
import java.util.List;

class Person {
    private String userName;
    private int age;

    public Person(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public int getAge() {
        return age;
    }
}

public class FilterDemo {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Dave", 43));
        list.add(new Person("John", 25));
        list.add(new Person("Aaron", 36));
        list.add(new Person("Vikram", 18));
        list.add(new Person("Ryan", 63));
        list.add(new Person("Todd", 5));
        list.stream().filter(person -> person.getAge() >= 18 && person.getAge() <= 60).forEach(System.out::println);


    }
}
