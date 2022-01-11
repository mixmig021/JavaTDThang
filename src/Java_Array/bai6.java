package Java_Array;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int [] a = new int [n];
        System.out.print("Nhập  mảng: \n");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Nhập phần tử k = ");
        int k = sc.nextInt();
        sort(a);
        System.out.print("Sắp xếp mảng tăng dần: ");
        show(a);
        System.out.printf("\nChèn phần tử %d vào mảng.", k);
        a = inputArray(a, k);
        System.out.print("\nMảng sau khi chèn: ");
        show(a);
    }

    public static void sort(int [] a) {
        int temp = a[0];
        for (int i = 0 ; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }

    public static int [] inputArray(int [] a, int k) {
        int arr = a.length - 1;
        int temp = a.length;
        int [] tempArr = new int [temp + 1];
        boolean insert = false;

        for (int i = temp; i >= 0; i--) {
            if (arr > -1 && a[arr] > k) {
                tempArr[i] = a[arr--];
            } else {
                if (!insert) {
                    tempArr[i] = k;
                    insert = true;
                } else {
                    tempArr[i] = a[arr--];
                }
            }
        }
        return tempArr;
    }
    public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
