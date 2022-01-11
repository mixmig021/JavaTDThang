package Java_Array;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        int[][] a, b, c;
        int m, n, k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá trị m : ");
        m = sc.nextInt();
        System.out.print("Nhập giá trị n : ");
        n = sc.nextInt();
        System.out.print("Nhập giá trị k : ");
        k = sc.nextInt();

        a = nhapmang(m, n);
        b = nhapmang(n, k);
        System.out.println("Ma trận A:");
        mang(a);
        System.out.println("Ma trận B:");
        mang(b);
        System.out.println("Tích 2 ma trận A và B là: ");
        c = tich(a, b);
        mang(c);
    }
    public static int [][] nhapmang(int m,int n){
        int[][] mang = new int [m][n];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("nhập mảng [ "+ i +" ] [ "+ j +" ] : ");
                mang[i][j] = sc.nextInt();
            }
        }
        return mang;
    }

    public static int [][] tich(int[][] a, int [][] b){
        int [][] x = new int[a.length][b[0].length];
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < b[0].length; j++) {
                for(int h = 0; h < a[0].length; h++)
                    x[i][j] += a[i][h] * b[h][j];
            }
        }
        return x;
    }
    public static void mang(int[][] a) {
        for(int [] x : a) {
            for(int y : x)
                System.out.print(y + " ");
            System.out.println(" ");
        }
    }
}
