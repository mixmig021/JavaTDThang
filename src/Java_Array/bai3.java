package Java_Array;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        System.out.print("Nhập số phần tử có trong mảng: ");
        int n = new Scanner(System.in).nextInt();
        int[] b = new int[n];
        int[] a = new int[n];
        dem(a, b, n);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + " : ");
            a[i] = new Scanner(System.in).nextInt();
            b[i] = 0;
        }
    }

        private static void dem ( int[] a, int[] b, int n){
            int check = 0;
            int count;
            int max = 0;

            for (int i = 0; i < n; i++) {
                count = 1;
                if (b[i] == 0) {
                    b[i] = 1;
                    for (int j = i + 1; j < n; j++) {
                        if (a[j] == a[i]) {
                            count++;
                            b[j] = 1;
                        }
                    }
                    System.out.println("phần tử " + a[i] + "xuất hiện " + count + "lần");
                    if (max < count) {
                        max = count;
                    }
                    if (max == count) {
                        check = a[i];
                    }
                }
            }
            System.out.println("Phần tử xuất hiện nhiều nhất trong mảng là: " + check);
        }
    }
