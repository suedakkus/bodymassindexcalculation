
package beden_kitle_indeksi;

import java.util.Scanner;


public class Beden_kitle_indeksi {

    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Lütfen kilonuzu giriniz: ");
        int kilo=scanner.nextInt();
        
        System.out.print("Lütfen boyunuzu giriniz(örnek: 1,75): ");
        double boy=scanner.nextDouble();
        
        double indeks= kilo/(boy*boy);
        System.out.println("Beden kitle indeksiniz: " +indeks);
        
        /*System.out.println("Lütfen kilonuzu kg cinsinden giriniz: ");
        int kilo = scanner.nextInt();
        
        System.out.println("Lütfen boyunuzu cm cinsinden giriniz: ");
        int boy = scanner.nextInt();
        
        int a = (kilo/(boy/100));
        int b = (a*(boy/100));
        
        System.out.println("Beden kitle indeksiniz: "+ b);*/
        
        //Beden kitle indeksi= Kilo/Boy(m)*Boy(m)
        
        
        
        
    }
    
}
