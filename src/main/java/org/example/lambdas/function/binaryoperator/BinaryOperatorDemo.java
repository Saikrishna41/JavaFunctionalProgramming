package org.example.lambdas.function.binaryoperator;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/**
 * BinaryOperator<T>
 * BinaryOperator<T> is a functional interface that inherits from BiFunction<T, T, T> interface.
 * The BinaryOperator<T> interface takes only one parameter as compared to BiFunction<T, T, T>
 * , which takes three parameters(two operands type and one result type).
 * <p>
 * Both the input objects and the result are of the same type in BinaryOperator<T>.
 * <p>
 * Below are the few interfaces that come under the BinaryOperator<T> category.
 */

class User {
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class BinaryOperatorDemo {
    public static void main(String[] args) {
        User u1 = new User("Daniel", 23);
        User u2 = new User("Alex", 44);
        BinaryOperator<User> operator = (user1, user2) -> {
            user1.setName(user2.getName());
            user1.setAge(user2.getAge());
            return user1;
        };

        operator.apply(u1, u2);
        System.out.println("the user1 name is now " + u1.getName() + " and age is now " + u1.getAge());

    }
}
