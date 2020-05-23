package ch07;
public class Mergesorting {
    public static void main(String ikhsanul[]){
     int [] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
     System.out.println("Sebelum di Urutkan menggunakan merge sort ");
     for(int i = 0; i < angka.length; i++){
        System.out.print(angka[i]+" ");
     }
     System.out.println();
     Ikhsanulhamdi(angka,0,angka.length-1);
     System.out.println();   
     System.out.println("Setelah di Urutkan menggunakan merge sort ");
     for(int i = 0; i < angka.length; i++){
        System.out.print(angka[i]+" ");
     }

}
   public static void Ikhsanulhamdi(int [] a, int b, int c){ 
     int ayam = b;
     int tikus = c;
     if (ayam>=tikus){
        return;
     }
     int ikhsanul=(ayam+tikus)/2;
     Ikhsanulhamdi(a,ayam,ikhsanul);
     Ikhsanulhamdi(a,ikhsanul+1,tikus);
     int hamdi=ikhsanul;
     int ikhsan=ikhsanul+1;
     while ((b<=hamdi) && (ikhsan<=tikus)){
        if (a[ayam]<a[ikhsan]){
           ayam++;
        }
        else
      {
           int aku=a[ikhsan];
           for (int k=ikhsan-1;k>=ayam;k--)
           {
              a[k+1]=a[k];
           }
           a[ayam]=aku;
           ayam++;
           hamdi++;
           ikhsan++;
      }
    }
  }  
}