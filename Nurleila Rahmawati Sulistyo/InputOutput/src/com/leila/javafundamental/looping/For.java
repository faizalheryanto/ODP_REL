package com.leila.javafundamental.looping;

import java.util.Arrays;
import java.util.List;

public class For {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Angka : " + i);
        }

        int a = 5;
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        int [] numbers = {10, 20, 30, 40, 50};

        for(int index = 0; index < numbers.length; index++) {
            System.out.print("value of item : " + numbers[index] );
            System.out.print("\n");
        }

        // Implementing nested for loop
        // Initializing loop counters
        int num = 1;
        int i = 1;

        // outer for loop
        for (num = 1; num <= 10; num++) {
            //inner for loop
            System.out.print("Table of " + num + " is : ");
            for (i = 1; i <= 10; i++) {
                // printing table
                System.out.print(num * i + " ");
            }
            // printing a new line
            System.out.println();
        }

    }
}
