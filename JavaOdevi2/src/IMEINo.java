
import javaodevi2.JavaOdevi2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author marsh
 */
public class IMEINo extends denem1 {

    JavaOdevi2 IMEINo = new JavaOdevi2(9);
    int SumDigit = 0;
    int SumDigit2 = 0;
    int[] digits;
    int[] dg;

    

    public void ImeiUret() {
        int cikacak = 0;
    int yuvarlanmis = 0;
        digits = new int[15];
        dg = new int[15];
        digits[14] = 0;
        for (int i = 0; i < 14; i++) {
            if (IMEINo.nextInt() + 1 == 0) {
                continue;
            }
            digits[i] = IMEINo.nextInt() + 1;
            // 18 
        }

        for (int i = 0; i < 14; i++) {
            if (i % 2 == 1) {
                SumDigit2 = digits[i] * 2;
                if (digits[i] > 10) {
                    digits[i] = digits[i] / 10;
                    SumDigit2 = digits[i] + 1;
                } else {
                    SumDigit2 = digits[i];
                }
            } else {
                SumDigit = digits[i];

            }
            yuvarlanmis = (int) Math.ceil(((digits[14] + 5) / 10) * 10);
            cikacak = digits[14];

            if (yuvarlanmis >= cikacak) {

                digits[14] = yuvarlanmis - cikacak;

            } else {

                yuvarlanmis = (int) Math.ceil(((digits[14] + 5) / 10) * 10);
                digits[14] = yuvarlanmis - cikacak;

            }

        }

        for (int i = 0; i < 15; i++) {
            dg[i] = digits[i];
            System.out.print(dg[i]);

        }
        /*
        Alt Taraf Debugging İçin
         */
        System.out.print("\n cikacak: " + cikacak);
        System.out.print("\n yuvarlanmis: " + yuvarlanmis);
        System.out.print("\n 15.eleman(yuvarlanmis - cikacak): " + digits[14]);

    }

}
