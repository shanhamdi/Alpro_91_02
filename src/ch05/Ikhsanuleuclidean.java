package ch05;
import java.util.Scanner;
public class Ikhsanuleuclidean {
    public static void main (String [] args){
    int m, n, r;
    Scanner ras = new Scanner(System.in);
    System.out.print("m : ");
    m = ras.nextInt();
    System.out.print("n : ");
    n = ras.nextInt();	
    r = m % n;
    while (r != 0) {
    m = n;
    n = r;
    r = m % n;
}			
    System.out.println("FPB = " + n);		
}
}