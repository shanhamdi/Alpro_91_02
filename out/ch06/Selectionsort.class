package ch06;
public class Selectionsort {
     private final int[] ikhsanul;
	public Selectionsort(int r) {
        this.ikhsanul = new int[r];
    }
	public void Ras(int a, int b) {
        if (a >= 0 && a < this.ikhsanul.length) {
            this.ikhsanul[a] = b;
        }
    }
    public void Ikhsanul() {
        String angka = "Angka Array = ";
        for (int c= 0; c <this.ikhsanul.length; c++) {
            angka += this.ikhsanul[c] + ", ";
        }
        System.out.println(angka);
    }
    private void Hamdi(int d, int e) {
        int aku = this.Ikhsanul[d];
        this.ikhsanul[d] = this.ikhsanul[e];
        this.ikhsanul[e] = aku;
    }
    public void Ikhsan() {
        for (int f = 0; f < this.ikhsanul.length; f++) {
            int ayam = f;
            for (int g = f; g < this.ikhsanul.length; g++) {
                if (this.ikhsanul[g] < this.ikhsanul[ayam]) {
                    ayam = g;
                }
            }
            Ikhsan(f, ayam);
        }
    }
    public static void main(String[] args) {
        Selectionsort a = new Selectionsort(13);
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