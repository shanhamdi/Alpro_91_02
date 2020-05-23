package ch04;
public class IkhsanulD {
        public static void main(String[] args) {
        int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        for(int x : angka){
            if(x % 3 == 0){
                System.out.print(x+"-");
            }
        }
    }
}