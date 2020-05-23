package ch08;
import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class Millerrabin {
    public boolean ikhsanul(long n, int m){
        if (n == 0 || n == 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        long s = n - 1;
        while (s % 2 == 0)
            s /= 2;
        Random ras = new Random();
        for (int i = 0; i < m; i++){
            long r = Math.abs(ras.nextLong());            
            long a = r % (n - 1) + 1, t = s;
            long mod = m(a, t, n);
            while (t != n - 1 && mod != 1 && mod != n - 1){
                mod = d(mod, mod, n);
                t *= 2;
            }
            if (mod != n - 1 && t % 2 == 0)
                return false; 
        }
        return true;        
    }
    public long m(long a, long b, long c) {
        long ikh = 1;
        for (int i = 0; i < b; i++){
            ikh *= a;
            ikh %= c; 
        }
        return ikh % c;
    }
    public long d(long a, long b, long mod) {
        return BigInteger.valueOf(a).multiply(BigInteger.valueOf(b)).mod(BigInteger.valueOf(mod)).longValue();
    }
    public static void main (String[] args) {
        Scanner ras = new Scanner(System.in);
        Millerrabin sha = new Millerrabin();
        System.out.println("masukkan angka");
        long num = ras.nextLong();
        System.out.println("masukkan iterasi");
        int k = ras.nextInt();
        boolean prime = sha.ikhsanul(num, k);
        if (prime)
            System.out.println(num +" adalah prima");
        else
            System.out.println(num +" bukan prima");
 
    }
}