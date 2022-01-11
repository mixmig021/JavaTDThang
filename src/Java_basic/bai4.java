package Java_basic;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen a : ");
        int a = scanner.nextInt();
        System.out.println("Nhap so nguyen b: ");
        int b = scanner.nextInt();
        int x,y,z=0;
            for(x=a;x<b;x++){
                for(y=x+1;y<=b;y++) {
                    if (x != y) {
                        int g = x;
                        int f = y;
                        while (g != f) {
                            if (g > f) {
                                g-= f;
                            } else {
                                f -= g;
                            }
                        }
                        if(f==1){
                            System.out.println("2 so " + x + " và " + y+" la cap so nguyen to");
                        }
                    }
                }
            }
        }
    }
