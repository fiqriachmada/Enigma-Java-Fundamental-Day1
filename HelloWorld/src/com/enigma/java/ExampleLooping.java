package com.enigma.java;

import java.util.Scanner;

public class ExampleLooping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("For");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Angka ke-" + i);
        }

        System.out.println("\nWhile");
        int number = 1;

        while (number <= 5) {
            System.out.println("Angka ke-" + number);
            number++;
        }

        System.out.println("\nDo While");
        int numbers = 1;

        do {
            System.out.println("Angka ke-" + numbers);
            numbers++;
        } while (numbers <= 5);

        System.out.println("\nWhile");
        boolean condition = true;

//        while (condition) {
//            String name = scanner.nextLine();
//            if (name.equals("mada")) {
//                condition = true;
//            }
//            System.out.println(name);
//        }

        System.out.println("\nFor");
        for (int j = 1; j <= 5; j++) {
            if (j % 2 == 1) {
                System.out.println("Angka ke-" + j + " adalah ganjil");
            } else {
                System.out.println("Angka ke-" + j + " adalah genap");
            }
        }
    }
}
