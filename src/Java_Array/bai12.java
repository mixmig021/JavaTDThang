package Java_Array;

import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n: ");
        n = scanner.nextInt();

        int a[][] = new int[n][n] ;

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++){
                System.out.print("Nhập phần tử thứ [" + i + "," + j + "]: ");
                a[i][j] = scanner.nextInt();
            }
        System.out.println("Ma tran vua nhap \n");
        outputMaTran(a, n );
        int[][] temp ;
        temp =  xoayMaTran(a,n);
        System.out.println("xoay ma tran \n");
        outputMaTran(temp,n);
    }
    public static void outputMaTran(int a[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
    public static int[][] xoayMaTran(int a[][], int n) {
        int[][] temp = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                temp[i][j] = a[j][n-1-i];
            }
        return temp;
    }


}