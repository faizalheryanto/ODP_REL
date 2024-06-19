package com.leila.javafundamental.inputouput;

import java.util.Scanner;

public class InputOutputFunction {
    public static void main(String[] args) {
        // inisialisasi
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program penjumlahan sangat sederhana");
        System.out.print("Masukan Angka pertama : ");
        //mengambil data yang diinput
        int value = scanner.nextInt();
        System.out.print("Masukan Angka kedua : ");
        int anotherValue = scanner.nextInt();
        int result = value + anotherValue;
        System.out.println("Hasilnya adalah : " + result);
    }
}
