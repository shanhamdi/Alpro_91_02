package ch03;
import java.util.Scanner;
public class Ikhsanulresponsia {
    public static void main(String[] args) {
        Scanner ras = new Scanner (System.in);
        int x;
        int y;
        System.out.println("Masukkan nilai x");
        x = ras.nextInt();
        System.out.println("Masukan nilai y");
        y = ras.nextInt();
        if (x > y){
            System.out.println("Nilai tertinggi adalah :" + x);
        }
        else if (x < y){
        System.out.println("Nilai tertinggi adalah :" + y);
        }
        else {
            System.out.println("Masukkan nilai ulang");
        }

    }
}