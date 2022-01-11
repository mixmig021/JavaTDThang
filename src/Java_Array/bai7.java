package Java_Array;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        System.out.print("Nhập số phần tử mảng n là: ");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];
        System.out.print("Nhập mảng n: ");
        for (int i = 0; i < n; i++) {
            a[i] = new Scanner(System.in).nextInt();
        }
        int[] b = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            b[i] = 1;
            for (int j = i; j < n - 1; j++) {
                if (a[j] <= a[j + 1]) {
                    b[i]++;
                }
                if (a[j] > a[j + 1]) {
                    break;
                }
            }
            if (b[i] > max) {
                max = b[i];
            }
        }
        System.out.println("Đường chạy dài nhất có độ dài: "+ max);
        for (int i = 0; i < n; i++) {
            if (max == b[i]) {
                System.out.println("Tại vị trí: "+ (i + 1));
            }
        }
    }
}