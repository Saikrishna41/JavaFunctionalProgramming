package org.example.lambdas.function.unary;

import java.util.function.UnaryOperator;

class Person2 {
    private String  name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person2() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class UnaryOperatorDemo {
    public static void main(String[] args) {
        Person2 person = new Person2();
        UnaryOperator<Person2> operator = person1 -> {
            person1.setName("Sai");
            person1.setAge(33);
            return person1;
        };

        operator.apply(person);

        System.out.println("Person name "+person.getName()+ " and age is "+person.getAge());
    }
}
