package Java_basic;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen a : ");
        int a = scanner.nextInt();
        System.out.println("Nhap so nguyen b: ");
        int b = scanner.nextInt();
        System.out.println("UCLN caa " + a + " và " + b
                + " là: " + UCLN(a, b));
        // tính BSCNN của a và b
        System.out.println("BCNN cua " + a + " và " + b
                + " là: " + BCNN(a, b));
    }
    public static int UCLN(int a, int b) {
        int x = a;
        int y = b;
        while (x != y) {
            if (x > y) {
                x -= y;
            } else {
                y -= x;
            }
        }
        int uscln = x;
        return uscln;
    }
    public static int BCNN(int a, int b) {
        return (a * b) / UCLN(a, b);
    }
}
