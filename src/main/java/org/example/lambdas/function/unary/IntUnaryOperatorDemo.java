package org.example.lambdas.function.unary;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorDemo {
    public static void main(String[] args) {
        IntUnaryOperator operator = (a) -> a * a;
        System.out.println("The product is "+operator.applyAsInt(23));

    }
}
