package Java_basic;

import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        System.out.println("Nhap so n : ");
        Scanner scanner = new Scanner(System.in);
        int tong= 0;
        int n = scanner.nextInt();
        if(n%2==0){
            tong = (2+n)*n/4;
        }else if(n%2!=0){
            tong = (1+n)*(n+1)/4;
        }
        System.out.println("tong S ="+tong);
    }
}
