package com.enigma.java;

import java.util.Scanner;

public class ExampleInputOutput {
    public static void main(String[] args) {
        String fullName;
        int age;

        System.out.println("Biodata Mahasiswa");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nama Mahasiswa = ");
        fullName = scanner.nextLine();

        System.out.println("Umur Mahasiswa = ");
        age = scanner.nextInt();

        System.out.println("Umur Mahasiswa = " + fullName);
        System.out.println("Umur Mahasiswa = " + age);
    }
}
