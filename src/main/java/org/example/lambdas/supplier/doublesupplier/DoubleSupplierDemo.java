package org.example.lambdas.supplier.doublesupplier;

import java.util.function.DoubleSupplier;
import java.util.function.Supplier;



public class DoubleSupplierDemo {
    public static void main(String[] args) {
        DoubleSupplier supplier = () -> (double) 22 * 93;
        System.out.println("double supplier value is "+supplier.getAsDouble());
    }
}
