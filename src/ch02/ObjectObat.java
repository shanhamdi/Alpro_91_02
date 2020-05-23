package ch02;

import java.util.Date;

public class ObjectObat {
    public static void main(String[] args) {  
        Obat xl = new Obat();
        xl.barcode = "9348399348";
        x1.nama = "Paramax";
        xl.tanggalKedaluarsa = new Date(20201020);
        x1.harga = 6000;

        Obat x2 = new Obat();
        x2.barcode = "9348399349";
        x2.nama = "Badrex";
        x2.tanggalKedaluarsa = new Date(2020116);
        x2.harga = 7500;

        System.out.println(xl.nama + " (" + xl.barcode +      
")");
        System.out.println ("Harga: Rp" + xl.harga);
        System.out.println ("Exp: " +
x1.tanggalKedaluarsa.toString());


        System.out.println("============================");

        System.out.println(x2.nama + " (" + x2.barcode +
")");
        System.out.println("Harga: Rp" + x2.harga);
        System.out.println("Exp: " +
x2.tanggalKedaluarsa.toString());
    
	}
}	