package Java_basic;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("các số nguyên tố có 6 chữ số chỉ bao gồm các chữ số lẻ: ");
        for (int i = 100001; i < 999999; i+=2) {
            if (isPrimeNumber(i)&&check(i)) {
                count++;
                System.out.print(i + " ");
            }
        }
//        System.out.print(count + " ");
    }

    public static boolean check(int a) {
        int b = 0, d = 0;
        while (a > 0) {
            b = a % 10;
            if (b % 2 == 1) d++;
            a /= 10;
        }
        if (d == 6) return true;
        else return false;
    }

    public static boolean isPrimeNumber(int a) {
        if (a < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(a);
        for (int i = 2; i <= squareRoot; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
