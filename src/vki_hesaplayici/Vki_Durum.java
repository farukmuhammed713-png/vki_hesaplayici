package vki_hesaplayici;

public class Vki_Durum {
    
     public String durum(double vki){
         if(vki<18.5){
          return "Zayıf";
         }
         else if(vki>18.6&&vki<25){
          return "Normal";
         }
         else if(vki>25.1&&vki<30){
          return "Fazla Kilolu";
         }
         else{
          return "Obez";
         }
     
     
     }
    
}
