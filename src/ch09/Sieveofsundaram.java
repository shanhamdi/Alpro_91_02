package ch09;
import java.util.Scanner;

public class Sieveofsundaram {
    private boolean[] c(int l) {
        int n = l/2;
        boolean[] p = new boolean[l];        
        for (int a = 1; a < n; a++)
            for (int j = a; j <= (n - a) / (2 * a + 1); j++)
                p[a + j + 2 * a * j] = true;
 
        return p;
    }
    public void g(int N){
        boolean[] p = c(N);
        d(p);
    }
    public void d(boolean[] primes){
        System.out.print("Prima = 2 3 ");
        for (int a = 2; a < primes.length/2; a++)
            if (!primes[a])
                System.out.print((2 * a + 1) +" ");
        System.out.println();
    }
    public static void main (String[] args) {
        Scanner ras = new Scanner(System.in);
         Sieveofsundaram s = new  Sieveofsundaram();
        System.out.println("Masukkan angka");
        int n = ras.nextInt();
        s.g(n);        
    }
}