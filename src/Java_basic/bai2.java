package Java_basic;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen n : ");
        int n = scanner.nextInt();
        System.out.printf("Các ước số của %d là: ",n);
        int so =  0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.print(i + "\t");
                so++;
            }
        }
        System.out.printf("%nCác số ước số của "+n+" là: "+ so);

    }
}