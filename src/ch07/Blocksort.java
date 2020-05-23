package ch07;
public class Blocksort {
        private Blocksort(int[] ikhsanul) {
        int r = ikhsanul.length;
        for (int a = 1;a<r;a++) {
            int hamdi = ikhsanul [a];
            int s=a-1;
            while ((s>-1)&&(ikhsanul[s]>hamdi)){
                ikhsanul[s+1] = ikhsanul[s];
                s--;
            }
            ikhsanul[s+1]=hamdi;
        }
    }
    private int[] ikhsanul;

    public static void main(String[] args) {
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Sebelum diurutkan menggunakan block sort");
        for (int b:angka){
            System.out.print(b+" ");
        }
        System.out.println();
            Blocksort blocksort = new Blocksort(angka);

        System.out.println("Setelah diurutkan menggunakan block sort");
        for(int b:angka){
            System.out.print(b+" ");
        }
    }
}