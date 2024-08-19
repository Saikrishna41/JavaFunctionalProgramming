package org.example.lambdas.supplier.intsupplier;

import org.example.lambdas.Person;

import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class IntSupplierDemo {
    public static void main(String[] args) {
        IntSupplier supplier = () -> (int) 3 * 10;
        System.out.println("value is "+supplier.getAsInt());
    }
}
