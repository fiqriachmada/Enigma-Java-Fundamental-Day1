package com.enigma.java;

import java.util.Scanner;

public class ChallangesBintang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Challanges\n");
        System.out.print("Inputan = ");
        //        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        int i = k;
        while (i >= 1) {
            k = 1;
            while (k < i) {
                System.out.print("*");
                k++;
            }
            System.out.println("");
            i--;
        }
    }
}
