package ch09;
public class Aksprimalitytest {
    private static final long [] r = new long[64];
    public static void main(String[] args) {
        for (int n = 0; n < 10; n++) {
            c(n);
        }
        System.out.print("Prima:");
        for (int n = 1; n < r.length; n++)
            if (i(n))
                System.out.printf(" %d", n);
 
        System.out.println();
    }
    static void c(int n) {
        r[0] = 1;
        for (int i = 0; i < n; r[0] = -r[0], i++) {
            r[1 + i] = 1;
            for (int j = i; j > 0; j--)
                r[j] = r[j - 1] - r[j];
        }
    }
    static boolean i(int n) {
        c(n);
        r[0]++;
        r[n]--;
        int i = n;
        while (i-- != 0 && r[i] % n == 0) {
        }
        return i < 0;
    }
}
