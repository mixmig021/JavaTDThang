package Java_basic;

import java.util.Scanner;

public class bai1b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen n : ");
        int n = scanner.nextInt();

        double tong= 0;

        if(n>0) {
           for(int i =1;i<n+1;i++){
               tong = tong + 1.0/i;
           }
        }System.out.println("tong S =" + tong);
    }
}
