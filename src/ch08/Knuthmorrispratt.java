package ch08;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Knuthmorrispratt {
    private final int[] ras;
    public Knuthmorrispratt(String a, String b) {
        ras = new int[b.length()];
        f(b);
        int t = sha(a, b);
        if (t == -1)
            System.out.println("Tidak diTemukan");
        else
            System.out.println("Ditemukan Index ke- "+ t);
    }
    private void f(String p) {
        int n = p.length();
        ras[0] = -1;
        for (int j = 1; j < n; j++) {
            int i = ras[j - 1];
            while ((p.charAt(j) != p.charAt(i + 1)) && i >= 0)
                i = ras[i];
            if (p.charAt(j) == p.charAt(i + 1))
                ras[j] = i + 1;
            else
                ras[j] = -1;
        }
    }
    private int sha(String t, String p){
        int i = 0, j = 0;
        int l = t.length();
        int e = p.length();
        while (i < l && j < e) {
            if (t.charAt(i) == p.charAt(j)){
                i++;
                j++;
            }
            else if (j == 0)
                i++;
            else
                j = ras[j - 1] + 1;
        }
        return ((j == e) ? (i - e) : -1);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader ras = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Masukkan Teks");
        String t = ras.readLine();
        System.out.println("Masukkan kata");
        String k = ras.readLine();
        Knuthmorrispratt ke = new Knuthmorrispratt(t, k);
    }
}