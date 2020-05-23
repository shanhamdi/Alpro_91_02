package ch08;
public class Longestcommonsubstringproblem {
    static String i, h;
    static int ikhsanul(int h, int i, int ayam) {
        if (h == 0 || i == 0) {
            return ayam;
        }
        if (i.charAt(h - 1) == h.charAt(i - 1)) {
            ayam = ikhsanul(h - 1, i - 1, ayam + 1);
        }
        ayam = Math.max(ayam, Math.max(ikhsanul(h, i - 1, 0), ikhsanul(h - 1, i, 0)));
        return ayam;
    }
    public static void main(String[] args){
        int z, k;
        i = "Ikhsanul";
        h = "Hamdi";
        z = i.length();
        k = h.length();
        System.out.println(ikhsanul(z, k, 0));
    }
}