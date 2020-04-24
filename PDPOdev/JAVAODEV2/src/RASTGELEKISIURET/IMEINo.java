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

    public String ImeiUret() {
        StringBuilder sb = new StringBuilder();
        digits = new int[15];
        dg = new int[15];
        int cikacak = 0;
        int yuvarlanmis = 0;
        int bolunmus1 = 0;
        int bolunmus2 = 0;
        int bolunmus3 = 0;
        int bolunmus4 = 0;
        int ikinciyuvarlanmis = 0;

        digits[14] = 0;
        for (int i = 0; i < 14; i++) {
            if (IMEINo.nextInt() + 1 == 0) {
                continue;
            }
            digits[i] = IMEINo.nextInt() + 1;

        }

        digits[14] = ((digits[0] % 10) + digits[0] / 10 + ((digits[1] * 2) % 10) + (digits[1] * 2) / 10 + (digits[2] % 10) + (digits[2] / 10) + ((digits[3] * 2) % 10) + (digits[3] * 2) / 10 + (digits[4] % 10) + digits[4] / 10) + ((digits[5] * 2) % 10) + (digits[5] * 2) / 10 + (digits[6] % 10) + digits[6] / 10 + ((digits[7] * 2) % 10) + (digits[7] * 2) / 10 + (digits[8] % 10) + (digits[8] / 10)
                + (digits[9] % 10) + digits[9] / 10 + ((digits[10] * 2) % 10) + (digits[10] * 2) / 10 + (digits[11] % 10) + (digits[11] / 10) + (digits[12] % 10) + digits[12] / 10 + ((digits[13] * 2) % 10) + (digits[13] * 2) / 10;

        /*
        
        Alt Taraf Parçalamanın Doğru Mu Yanlış Mı Yapıldığına Dair Kontrol Değişkenleridir Debugging Kısmında Yazdırılır
         */
        bolunmus1 = digits[0] % 10;
        bolunmus2 = digits[0] / 10;
        bolunmus3 = ((digits[1] * 2) % 10);
        bolunmus4 = (digits[1] * 2) / 10;

        /*
                
                Son Eklediğim Kısım Altta yeni bir değişken oluşturdum ve değişkenin modunu bi sonraki 10 değerine eşit olana kadar arttırdım sonra yuvarlamışa eşitledim
         */
        ikinciyuvarlanmis = digits[14];

        while (ikinciyuvarlanmis % 10 != 0) {
            ikinciyuvarlanmis += 1;
        }

        /*            
             yuvarlanmis= (int)Math.ceil(((digits[14]+5)/10)*10);
         */
        yuvarlanmis = ikinciyuvarlanmis;
        cikacak = digits[14];

        if (yuvarlanmis >= cikacak) {

            digits[14] = yuvarlanmis - cikacak;

        } else {

            yuvarlanmis = (int) Math.ceil(((digits[14] + 5) / 10) * 10);
            digits[14] = yuvarlanmis - cikacak;

        }

        for (int i = 0; i < 15; i++) {
            dg[i] = digits[i];
            sb.append(dg[i]);

        }
        return sb.toString();
    }

    public String İmeiKontrol(String Imei) {
        String Kontrol = "";
        double sayi = 0;
        double sayi2 = 0;
        int Dizi[] = new int[Imei.length()];

        if (Imei.length() != 15) {
            return "İmei No Geçersiz!";
        }
        for (int i = 0; i < Imei.length(); i++) {
            Dizi[i] = Integer.parseInt(Imei.substring(i,i+1));
        }
        for (int i = 0; i <=12; i+=2) {
            sayi +=Dizi[i];
        }
        for (int i = 1; i <= 13; i+=2) {
            if (Dizi[i] * 2 > 9) {
                sayi2 += Dizi[i] * 2 - 9;
            } else {
                sayi2 += Dizi[i] * 2;
            }
        }
        double yedek = ((Math.ceil((sayi+sayi2)/10))*10);
        for (int i = 0; i < 15; i++) {
            Kontrol += Dizi[i];
        }
        if (yedek - (sayi + sayi2) == Dizi[14]) {
            return "GeçerliImei";
        } else {
            return "GeçersizImei";
        }
    }
}
