package Java_Array;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        System.out.print("Nhập số phần tử có trong mảng: ");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int [n];
        for (int i = 0; i < n; i++){
            System.out.print("Nhập số thứ "+ (i + 1) +" : ");
            a[i] = new Scanner(System.in).nextInt();
        }
        System.out.print("mảng sau khi sắp xếp: ");
        sortArray(a,n);
    }

    private static void sortArray(int[] a, int n) {
        int temp = 0;
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                if (a[i] > a[j]){
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        System.out.print("[ ");
        for ( int i = 0; i <= n - 1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("]");
    }

}
