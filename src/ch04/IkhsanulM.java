package ch04;
public class IkhsanulM {
public static void main(String[] args) {
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int selisih, hasil = 0;
        System.out.print("Hasil penjumlahan angka selisih pada poin i adalah = ");
        for (int i = 1; i < angka.length; i++){
            selisih = angka[i-1] - angka[i];
            hasil += selisih;
        }
        System.out.println(hasil);
}
}