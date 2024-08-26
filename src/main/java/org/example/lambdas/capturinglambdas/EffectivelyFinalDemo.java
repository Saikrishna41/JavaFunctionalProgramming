package org.example.lambdas.capturinglambdas;

import java.util.function.UnaryOperator;

public class EffectivelyFinalDemo {
    public static void main(String[] args) {
        int i = 5;
        UnaryOperator<Integer> operator = (innput) -> innput * i;
        System.out.println("the value is "+operator.apply(33));
    }
}
