package Java_basic;
import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen n : ");
        int a = scanner.nextInt();
        int tong = 0;
        while (a !=0){
            int b = a%10;
            tong += b;
            a /=10;
        }
        System.out.println("tong cac chu so cua a: = "+tong);
    }
}
