package ch04;
public class IkhsanulG {
     public static void main(String[] args) {
        int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        for(int x = 0; x < angka.length; x++){
            if(angka[x] % 5 == 0 && angka[x+1] % 5 == 0){
                System.out.println(angka [x]);
                System.out.println(angka[x+1]);
            }
        }
    }
}