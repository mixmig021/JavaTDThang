package Java_Array;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x;
        System.out.print("Nhập số phần tử trong mảng: ");
        n = sc.nextInt();
        System.out.print("Nhập số X cần tìm: ");
        x = sc.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < n; i++)
        {
            System.out.print("Nhập phần tử " + (i + 1) + " trong mảng n: ");
            a[i] = sc.nextInt();
        }
        int min = Math.abs(a[0]-x);
        int vitri = 0;
        for(int i = 1; i < n - 1; i++)
        {
            if(min > Math.abs(a[i] - x)){
                min = Math.abs(a[i] - x);
                vitri = i;
            }
        }
        System.out.println("Số nguyên tố gần "+x+" nhất là " + a[vitri] + " ở vị trí a["+ (vitri)+"]");
    }
}