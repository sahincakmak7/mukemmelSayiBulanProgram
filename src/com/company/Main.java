package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num, result = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        num = inp.nextInt();
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                result += i;
            }
        }
        if (num == result) {
            System.out.println(num + " mükemmel sayıdır.");
        } else {
            System.out.println(num + " mükemmel sayı değildir.");
        }
    }
}


