package ch04;
public class IkhsanulL {
        public static void main(String[] args) {
        int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        for(int x = 0; x < angka.length; x++){
            if (x != 12){
                if((angka[x] + angka[x+1]) % 2 == 0){
                    int hasil = angka[x] + angka[x+1];
                    System.out.println(angka[x] +"+"+ angka[x+1] + " = " + hasil);
                }
            }
        }
    }
}