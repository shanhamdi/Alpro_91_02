package ch05;
public class LongestCommonSubsequence {
    int lcs( char[] r, char[] a, int s, int y ){
        if (s == 0 || y == 0)
            return 0;
        if (r[s-1] == a[y-1])
            return 1 + lcs(r, a, s-1, y-1);
        else
            return max(lcs(r, a, s, y-1), lcs(r, a, s-1, y));
    }
    int max(int a, int b){
        return (a > b)? a : b;
    }
    public static void main(String[] args){
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        String s1 = "Ikhsanul";
        String s2 = "Hamdi";
        char[] A=s1.toCharArray();
        char[] B=s2.toCharArray();
        int x = A.length;
        int y = B.length;
        System.out.println("Panjang : " + " " +
                lcs.lcs( A, B, x, y ) );
    }
}
