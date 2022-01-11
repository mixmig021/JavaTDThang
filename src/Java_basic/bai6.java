package Java_basic;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen n : ");
        int a = scanner.nextInt();
        System.out.print("a=");
        while (a!=1){
            for(int i =1;i<a;i++){
                if(a%i==0&&i!=1){
                    a = a/i;
                    System.out.print(i+"*");
                    i = 1;
                }
            }
        }
    }
}
