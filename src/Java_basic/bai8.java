package Java_basic;

public class bai8 {
    public static void main(String[] args)  {
        System.out.println("các số nguyên tố có 6 chữ số chỉ bao gồm  chữ số thuận nghịch: ");
        for (int i = 100000; i < 999999; i++) {
            if (thuanngich(i)) System.out.println(i);
        }
        System.out.println("các số nguyên tố có 6 chữ số chỉ bao gồm  chữ số thuận nghịch tổng các chữ số là 10: ");
        for (int i = 100000; i < 999999; i++) {
            if (thuanngich(i)&&check(i)) System.out.println(i);
        }
    }

    public static boolean thuanngich(int n){
        int reversed  = 0;
        int a = n;
        while(n > 0){
            reversed  = 10 * reversed  + n % 10;
            n /= 10;
        }
        if(a == reversed) return true;
        return false;
    }

    public static boolean check(int n){
        int a,tong = 0;
        while (n!=0){
            a = n%10;
            n/=10;
            tong = tong + a;
        }
        if(tong%10==0)return true;
        return  false;
    }
}