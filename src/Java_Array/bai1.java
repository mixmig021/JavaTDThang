package Java_Array;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        System.out.print("Nhập số phần tử có trong mảng: ");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int [n];
        for (int i = 0; i < n; i++){
            System.out.print("Nhập số thứ " + (i + 1) + " : ");
            a[i] = new Scanner(System.in).nextInt();
        }
        int check =1;
        for (int i = 0; i < n / 2; i++) {
            if (a[i] != a[n - i - 1]) {
                check = 0;
                break;
            }
        }
            System.out.print("Mảng [");
            for ( int i = 0; i <= n - 1; i++) {
                System.out.print(a[i] + " ");
            }
            if(check==1) System.out.print("] là mảng đối xứng");
            else System.out.print("] không phải là mảng đối xứng");
    }
}