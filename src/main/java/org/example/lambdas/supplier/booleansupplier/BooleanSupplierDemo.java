package org.example.lambdas.supplier.booleansupplier;

import org.example.lambdas.Person;

import java.util.Random;
import java.util.function.BooleanSupplier;

public class BooleanSupplierDemo {
    public static void main(String[] args) {
        Random random = new Random();
        BooleanSupplier booleanSupplier = () -> {
            int number = random.nextInt(100);
            System.out.println("Generated number "+number);
            return number % 2 == 0;
        };
        boolean isEven = booleanSupplier.getAsBoolean();
        System.out.println("Is the number even "+isEven);
    }
}
