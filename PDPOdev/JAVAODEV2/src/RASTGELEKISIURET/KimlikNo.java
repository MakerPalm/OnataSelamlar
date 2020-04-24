package RASTGELEKISIURET;

import RASTGELEKISIURET.SimpleRandom;

/**
 *
 * @author marsh
 */
public class KimlikNo {

    private int[] digits;
    private int[] dg;
    SimpleRandom TcNo = new SimpleRandom(8);

    public String Uret() {
        StringBuilder sb = new StringBuilder();
        digits = new int[11];
        dg = new int[11];

        digits[9] = 0;
        digits[10] = 0;
        for (int i = 0; i < 9; i++) {
            if (TcNo.nextInt() + 1 == 0) {
                continue;
            }
            digits[i] = TcNo.nextInt() + 1;

        }
        digits[9] = ((digits[0] + digits[2] + digits[4] + digits[6] + digits[8]) * 7 - (digits[1] + digits[3] + digits[5] + digits[7])) % 10;
        digits[10] = (digits[0] + digits[1] + digits[2] + digits[3] + digits[4] + digits[5] + digits[6] + digits[7] + digits[8] + digits[9]) % 10;

        for (int i = 0; i < 11; i++) {
            dg[i] = digits[i];
            sb.append(dg[i]);

        }

        return sb.toString();
    }

    public String KimlikNoKontrol(String Tc) {
        int tcDizi[] = new int[Tc.length()];
        int sayi10, sayi11, yedek = 0;
        if (Tc.length() != 11) {
            return "Geçersiz T.C NO";
        }
        for (int i = 0; i < Tc.length(); i++) {
            tcDizi[i] = Integer.parseInt(Tc.substring(i,i+1));
        }
        sayi10 = ((tcDizi[0] + tcDizi[2] + tcDizi[4] + tcDizi[6] + tcDizi[8]) * 7 - (tcDizi[1] + tcDizi[3] + tcDizi[5] + tcDizi[7])) % 10;
        for (int i = 0; i <= 9; i++) {
            yedek +=tcDizi[i];
        }
        sayi11 = yedek%10;
        if (tcDizi[9]==sayi10&&tcDizi[10]==sayi11) {
            return "T.C NO Geçerli";
        } else {
            return "T.C NO Geçersiz";
        }
    }

}
