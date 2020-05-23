  
package ch06;
public class Insertionsort {
    private final int[] ikhsanul;
	public Insertionsort(int r) {
        this.ikhsanul = new int[r];
    }
	public void Ras(int a, int b) {
        if (a >= 0 && a < this.ikhsanul.length) {
            this.ikhsanul[a] = b;
        }
    }
    public void Ikhsanul() {
        String angka = "Angka Array = ";
        for (int c= 0; c <this.Ikhsanul.length; c++) {
            angka += this.ikhsanul[c] + ", ";
        }
        System.out.println(angka);
    }
    private void Hamdi(int d, int e) {
        int ayam = this.ikhsanul[d];
        this.ikhsanul[d] = this.ikhsanul[e];
        this.ikhsanul[e] = ayam;
    }
    public void Ikhsan() {
        for (int f = 1; f < this.ikhsanul.length; f++) {
            int g = f;
            while (g >0 && this.ikhsanul[g] < this.ikhsanul[g - 1]) {
                Hamdi(g,g-1);
                g--;
            }
        }
    }
    public static void main(String[] args) {
        Insertionsort a = new Insertionsort(13);
//int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        a.Ras(0, 82);
        a.Ras(1, 12);
        a.Ras(2, 41);
        a.Ras(3, 38);
        a.Ras(4, 19);
        a.Ras(5, 26);
        a.Ras(6, 9);
        a.Ras(7, 48);
        a.Ras(8, 20);
        a.Ras(9, 55);
        a.Ras(10, 8);
        a.Ras(11, 32);
        a.Ras(12, 3);

        a.Ikhsanul();
        a.Ikhsan();
        a.Hamdi();
    }
}