
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
class KimlikNo extends denem1 {

    int[] digits;
    int[] dg;
    JavaOdevi2 TcNo = new JavaOdevi2(8);

    public void Uret() {

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
            System.out.print(dg[i]);
        }

    }

}
