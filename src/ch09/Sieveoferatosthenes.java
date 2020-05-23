package ch09;
import java.util.Scanner;

public class Sieveoferatosthenes {
    private int[] c(int m) {
        int[] a = new int[m + 1];
        for (int i = 2; i <= Math.sqrt(m); i++) {
            if (a[i] == 0) {
                for (int j = i * i; j <= m; j += i) {
                    a[j] = 1;
                }
            }
        }
        return a;
    }
    public void p(int m){
        int[] s = c(m);
        d(s);
    }
    public void d(int[] e){
        System.out.print("Prima = ");
        for (int i = 2; i < e.length; i++)
            if (e[i] == 0)
                System.out.print(i +" ");
        System.out.println();
    }
    public static void main (String[] args) {
        Scanner ras = new Scanner(System.in);
        Sieveoferatosthenes s = new Sieveoferatosthenes();
        System.out.println("Masukkan angka");
        int n = ras.nextInt();
        s.p(n);        
    }
}