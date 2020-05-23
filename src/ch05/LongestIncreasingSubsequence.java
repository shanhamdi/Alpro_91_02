package ch05;
public class LongestIncreasingSubsequence {
    static int Ikhsanul;
    static int r(int [] k, int s){
        if (s == 1)
            return 1;
        int res, ayam = 1;
        for (int a = 1; a < s; a++) {
            res = r(k, a);
            if (k[a - 1] < k[s - 1] && res + 1 > ayam)
                ayam = res + 1;
        }
        if (Ikhsanul < ayam)
            Ikhsanul = ayam;
        return ayam;
    }
    static int hamdi(int [] w, int j){
        ikhsanul = 1;
        r(w, j);
        return hamdi;
    }
    public static void main(String args[]){
        int [] angka = { 82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3 };
        int x = angka.length;
        System.out.println("Panjang : " + hamdi(angka, x));
    }
}