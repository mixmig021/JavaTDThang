package Java_Array;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        System.out.print("Nhập số lượng phần tử mảng a: ");
        int n = new Scanner(System.in).nextInt();
        int[]a = new int[n];
        System.out.println("Nhập mảng a: ");
        for (int i = 0; i < n; i++){
            a[i] = new Scanner(System.in).nextInt();
        }
        System.out.print("Nhập số lượng phần tử mảng b: ");
        int m = new Scanner(System.in).nextInt();
        int[]b = new int[m];
        System.out.println("Nhập mảng b: ");
        for (int i = 0; i < n; i++){
            a[i] = new Scanner(System.in).nextInt();
        }
        System.out.print("Nhập số vị trí cần trèn p: ");
        int p = new Scanner(System.in).nextInt();
        System.out.print("Chèn mảng b vào vị trí p của a ta được mảng mới như sau");
        if (p >= 0 && p <= n){
            outputArray(a, 0, p);
            outputArray(b, 0, m);
            outputArray(a, p, n);
        }
    }
    private static void outputArray(int[] a, int d, int c) {
        for (int i = d; i < c; i++){
            System.out.print(a[i] + " ");
        }
    }

}