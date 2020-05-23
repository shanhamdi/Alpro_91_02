package ch04;
import java.util.Scanner;
public class IkhsanulB {
        public static void main(String[] args) {
        System.out.println("Masukkan Angka Yang Dicari");
        Scanner ras = new Scanner(System.in);
        int cari = ras.nextInt();
        int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        for(int x : angka){
            if(x == cari){
                System.out.println("Angka " + cari +" ditemukan");
                System.exit(0);
            }
            }
        System.out.println("Angka tidak ditemukan");
        }
}