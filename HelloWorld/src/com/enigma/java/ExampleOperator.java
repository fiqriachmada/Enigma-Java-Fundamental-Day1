package com.enigma.java;

public class ExampleOperator {
    public static void main(String[] args) {
        float number1 = 15;
        float number2 = 10;

        float add = number1 + number2;
        float minus = number1 - number2;
        float multiply = number1 * number2;
        float divide = number1 / number2;


        System.out.println("Hasil " + number1 + " + " + number2 + " = " + (add));
        System.out.println("Hasil " + number1 + " - " + number2 + " = " + (minus));
        System.out.println("Hasil " + number1 + " * " + number2 + " = " + (multiply));
        System.out.println("Hasil " + number1 + " / " + number2 + " = " + (divide));

        int i = 5;
        int j = 5;

        System.out.println(" ");
        System.out.println("Hasil " + i + " == " + j + " = " + (i == j));
        System.out.println("Hasil " + i + " > " + j + " = " + (i > j));
        System.out.println("Hasil " + i + " < " + j + " = " + (i < j));
        System.out.println("Hasil " + i + " >= " + j + " = " + (i >= j));
        System.out.println("Hasil " + i + " <= " + j + " = " + (i <= j));
        System.out.println("Hasil " + i + " != " + j + " = " + (i != j));
    }
}
