/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskagitmakas;
import java.util.Scanner;
import java.util.Random;
public class TasKagitMakas {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("TAŞ-KAĞIT-MAKAS OYUNUNA HOŞ GELDİNİZ.");
       String oyuncu;
        String bilgisayar=" ";
       
         System.out.println("KAÇ KERE OYNAMAK İSTERSİNİZ ?");
         int sayac=input.nextInt();
        Random rd =new Random();
        int pc=rd.nextInt(3)+1;
      
        if(pc==1){
            bilgisayar="T";
        }
        else if(pc==2){
            bilgisayar="K";
        }else if(pc==3){
            bilgisayar="M";
        }
       
     int count=0;
     int c=0;
          int i=0;
          while(i<sayac){
         System.out.println("TAŞ-KAĞIT-MAKAS hangisini seçeceksiniz ?");
         oyuncu=input.next().toUpperCase();
          System.out.print("BİLGİSAYARIN TERCİHİ :"+bilgisayar);
              System.out.println(" ");
              i++;
          
     if(oyuncu.equals(bilgisayar)){
         System.out.println("BERABERE");  
     } 
     else if(oyuncu.equals("T") && bilgisayar.equals("M"))
     {
         System.out.println("TAŞ MAKASI  KIRAR OYUNCU KAZANDI ");
         count++;
     }
     else if(bilgisayar.equals("K")&& oyuncu.equals("T")){
         System.out.println("KAĞIT TAŞI SARAR BİLGİSAYAR KAZANDI");
         c++;
     }
       else if(oyuncu.equals("K")&& bilgisayar.equals("M")){
         System.out.println("MAKAS KAĞIDI KESER BİLGİSAYAR KAZANDI");
         c++;
     } 
       else if(bilgisayar.equals("T") && oyuncu.equals("K"))
     {
         System.out.println("KAĞIT TAŞI SARAR  OYUNCU KAZANDI ");
         count++;
     }
     else if(oyuncu.equals("M")&& bilgisayar.equals("K")){
         System.out.println("MAKAS KAĞIDI KESER  OYUNCU KAZANDI");
         count++;
     }
     
    
     
     else if(bilgisayar.equals("T")&& oyuncu.equals("M")){
         System.out.println("TAŞ MAKASI KESER  BİLGİSAYAR KAZANDI");
         c++;
     }
       else{
         System.out.println("HATALI GİRİŞ");
    }
        
        
          }    
          System.out.println("BİLGİSAYARIN KAZANDIĞI :"+c);
          System.out.println("OYUNCUNUN KAZANDIĞI : "+count);
    }
    
}
