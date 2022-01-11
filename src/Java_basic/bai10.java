package Java_basic;

public class bai10 {
    public static void main(String[] args) {
        System.out.println("các số nguyên tố thỏa mãn điều kiện: ");
        for (int i = 1000000; i < 9999999; i++) {
            if (daonguoc(i) && isPrimeNumber(i)) System.out.println(i);
        }
    }

    public static boolean isPrimeNumber(int a) {
        if (a < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(a);
        for (int i = 2; i <= squareRoot; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean daonguoc(int n){
        int reversed  = 0;
        int a = n;
        while(n > 0){
            reversed  = 10 * reversed  + n % 10;
            n /= 10;
        }
        if(isPrimeNumber(reversed)) return true;
        return false;
    }
    public static boolean check(int n){
        int a;
        while (n!=0){
            a = n%10;
            n/=10;
            if(!isPrimeNumber(a))return false;
        }
        return  true;
    }
}