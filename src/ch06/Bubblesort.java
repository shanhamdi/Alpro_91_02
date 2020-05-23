package ch06;
public class Bubblesort {
    static void Bubblesort(int[] ikhsanul) {
        for (int r = 0; r < ikhsanul.length; r++) {
            for (int a = 0; a <ikhsanul.length - 1; a++) {
                if (ikhsanul[a] > ikhsanul[a + 1]) {
                    int ayam = ikhsanul[a];
                    ikhsanul[a] = ikhsanul[a + 1];
                    ikhsanul[a + 1] = ayam;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] ikhsanul = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        for (int r = 0; r < ikhsanul.length; r++) {
            System.out.print(risfi[r] + ", ");
        }
        System.out.println("");
        Bubblesort(ikhsanul);
        for (int r = 0; r < ikhsanul.length; r++) {
            System.out.print(ikhsanul[r] + ", ");
        }
    }
}