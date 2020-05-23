package ch09;
import java.util.Scanner;

public class Sieveofatkin {
    private boolean[] ikhsanul(int l) {
        boolean[] p = new boolean[l + 1];
        p[2] = true;
        p[3] = true;
        int r = (int) Math.ceil(Math.sqrt(l));
        for (int x = 1; x < r; x++) {
            for (int y = 1; y < r; y++){
                int n = 4 * x * x + y * y;
                if (n <= l && (n % 12 == 1 || n % 12 == 5))
                    p[n] = !p[n];
                n = 3 * x * x + y * y;
                if (n <= l && n % 12 == 7)
                    p[n] = !p[n];
                n = 3 * x * x - y * y;
                if ((x > y) && (n <= l) && (n % 12 == 11))
                    p[n] = !p[n];
            }
        }
        for (int i = 5; i <= r; i++)
            if (p[i])
                for (int j = i * i; j < l; j += i * i)
                    p[j] = false;
 
        return p;
    }
    public void g(int N){
        boolean[] bil = ikhsanul(N);
        d(bil);
    }
    public void d(boolean[] bil) {
        System.out.print("Prima = ");
        for (int i = 2; i < bil.length; i++)
            if (bil[i])
                System.out.print(i +" ");
        System.out.println();
    }
    public static void main (String[] args) { 
        Scanner ras = new Scanner(System.in);
        Sieveofatkin s = new  Sieveofatkin();
        System.out.println("Masukkan angka untuk menemukan prima");
        int n = ras.nextInt();
        s.g(n);        
    }
}