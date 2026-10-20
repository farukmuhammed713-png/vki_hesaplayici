package vki_hesaplayici;
import java.util.Scanner;
public class main {

    public static void main(String[] args) {
     VkiHesaplama hesaplayici = new VkiHesaplama();
        Vki_Durum durumHesaplayici = new Vki_Durum();
         double boy;
         double kilo;
        
        Scanner girdi=new Scanner(System.in);
      System.out.println("Lutfen kilonuzu giriniz");
        kilo=girdi.nextDouble();
      System.out.println("Lutfen boyunuzu giriniz");
        boy=girdi.nextDouble();
        
        double vki;
        vki=hesaplayici.hesapla(boy, kilo); 
      System.out.println("Vücut kitle indeksiniz "+vki);
      
       String durum = durumHesaplayici.durum(vki);
      System.out.println(durum);
    }
    
}
