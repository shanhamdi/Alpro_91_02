package ch07;
import java.util.Arrays;
public class CocktailSort {
    void CocktailSort(int[] ikhsanul){
    boolean ayam;
    do {
        ayam = false;
            for (int i =0; i<=  ikhsanul.length  - 2;i++) {
		if (ikhsanul[ i ] > ikhsanul[ i + 1 ]) {
		int aku = ikhsanul[i];
		ikhsanul[i] = ikhsanul[i+1];
		ikhsanul[i+1]=aku;
		ayam = true;
                }
		}
		if (!ayam) {
			break;
		}
		ayam = false;
		for (int i= ikhsanul.length - 2;i>=0;i--) {
                    if (ikhsanul[ i ] > ikhsanul[ i + 1 ]) {
			int tikus = ikhsanul[i];
			ikhsanul[i] = ikhsanul[i+1];
			ikhsanul[i+1]=tikus;
			ayam = true;
			}
		}
}
    while (ayam);
}
    public static void main(String args[]){
        CocktailSort ras = new CocktailSort();
        int sdk[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        System.out.println("Angka Array sebelum:");
        System.out.println(Arrays.toString(sdk));
        ras.CocktailSort(sdk);
        System.out.println("Angka Array sesudah:");
        System.out.println(Arrays.toString(sdk));
    }
}