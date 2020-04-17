/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RASTGELEKISIURET;
import RASTGELEKISIURET.SimpleRandom;
/**
 *
 * @author marsh
 */
public class IMEINo {
        int[] digits;
    int[] dg;
    SimpleRandom IMEINo = new SimpleRandom(8);

    public void ImeiUret() {

        digits = new int[15];
        dg = new int[15];
        int cikacak=0;
        int yuvarlanmis = 0;
        int bolunmus1=0;
        int bolunmus2 =0;
        int bolunmus3=0;
        int bolunmus4 =0;
        int ikinciyuvarlanmis=0;
        
       
        
        digits[14] = 0;
        for (int i = 0; i < 14; i++) {
            if (IMEINo.nextInt() + 1 == 0) {
                continue;
            }
            digits[i] = IMEINo.nextInt() + 1;

        }
        
        
        digits[14] = ((digits[0]%10) +digits[0]/10 + ((digits[1]*2)%10)+(digits[1]*2)/10 + (digits[2]%10)+(digits[2]/10) + ((digits[3]*2)%10)+(digits[3]*2)/10 + (digits[4]%10)+digits[4]/10) + ((digits[5]*2)%10)+ (digits[5]*2)/10+(digits[6]%10) +digits[6]/10 + ((digits[7]*2)%10)+(digits[7]*2)/10 + (digits[8]%10)+(digits[8]/10) +
                (digits[9]%10) +digits[9]/10 + ((digits[10]*2)%10)+(digits[10]*2)/10 + (digits[11]%10)+(digits[11]/10) +(digits[12]%10) +digits[12]/10 + ((digits[13]*2)%10)+(digits[13]*2)/10;
                
        /*
        
        Alt Taraf Parçalamanın Doğru Mu Yanlış Mı Yapıldığına Dair Kontrol Değişkenleridir Debugging Kısmında Yazdırılır
        */
        
                bolunmus1 =digits[0]%10;
                bolunmus2=digits[0]/10;
                 bolunmus3 =((digits[1]*2)%10);
                bolunmus4=(digits[1]*2)/10;
                
                /*
                
                Son Eklediğim Kısım Altta yeni bir değişken oluşturdum ve değişkenin modunu bi sonraki 10 değerine eşit olana kadar arttırdım sonra yuvarlamışa eşitledim
                */
                
               ikinciyuvarlanmis=digits[14];
               
               while(ikinciyuvarlanmis % 10 != 0){
               ikinciyuvarlanmis += 1;
               }
                
      /*            
               
               yuvarlanmis= (int)Math.ceil(((digits[14]+5)/10)*10);
        */
               yuvarlanmis=ikinciyuvarlanmis;
               cikacak=digits[14];
       
        
        if(yuvarlanmis>=cikacak){
            
            digits[14]=yuvarlanmis-cikacak;
            
        }
        else{
        
        yuvarlanmis= (int)Math.ceil(((digits[14]+5)/10)*10);
         digits[14]=yuvarlanmis-cikacak;
        
        
        }
       
        

        for (int i = 0; i < 15; i++) {
            dg[i] = digits[i];
            System.out.print(dg[i]);
            
        }
        /*
        Alt Taraf Debugging İçin
        */
        System.out.print("\n \n Debugging Değerleri: ");
        System.out.print("\n cikacak: "+cikacak);
        System.out.print("\n yuvarlanmis: "+yuvarlanmis);
        System.out.print("\n 15.eleman(yuvarlanmis - cikacak): "+digits[14]);
        System.out.print("\n bolunmus1 : "+bolunmus1);
        System.out.print("\n bolunmus2 : "+bolunmus2);
        System.out.print("\n bolunmus3 : "+bolunmus3);
        System.out.print("\n bolunmus4 : "+bolunmus4);
    }
}
