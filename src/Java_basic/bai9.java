package Java_basic;

public class bai9 {
    public static void main(String[] args) {
        System.out.println("các số nguyên tố có 7-9 chữ số thỏa mãn điều kiện: ");
        for (int i = 100000; i < 999999999; i++) {
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
            if(a!=0&&a!=8&&a!=6){return false;}
            else {
                n /= 10;
                tong = tong + a;
            }
        }
        if(tong%10==0)return true;
        return  false;
    }
}