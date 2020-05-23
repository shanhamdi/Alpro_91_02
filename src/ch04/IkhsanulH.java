package ch04;
public class IkhsanulH {
        public static void main(String[] args) {
        int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        int jumlah = 0;
        for(int x = 0; x < angka.length; x++){
            jumlah = jumlah+angka[x];
        }
        System.out.println(jumlah);
    }
}