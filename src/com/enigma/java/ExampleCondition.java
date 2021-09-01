package com.enigma.java;

import java.util.Scanner;

public class ExampleCondition {
    public static void main(String[] args) {
        boolean isOn = true;

        if (isOn == false) {
            System.out.println("Lampu sedang Menyala");
        } else {
            System.out.println("Lampu sedang Mati");
        }

        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Umur = ");
        age = scanner.nextInt();

        if (age >= 17 && age <= 30) {
            System.out.println("Anda Masih Cukup Dewasa");
        } else if (age > 30) {
            System.out.println("Anda Sudah Cukup Tua");
        } else {
            System.out.println("Anda Masih Muda");
        }

        switch (age) {
            case 17:
                System.out.println("Umur Anda 17 Tahun");
                break;
            case 30:
                System.out.println("Umur Anda 30 Tahun");
                break;
            default:
                System.out.println("Umur Anda tidak ada dalam sistem");
        }

        System.out.println("Age = " + age);
        System.out.printf("%s %d", "Age =", age);
    }
}
