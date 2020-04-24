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
public class Telefon {

    SimpleRandom Secim = new SimpleRandom(31);
    SimpleRandom Secim2 = new SimpleRandom(8);

    public String numara() {
        StringBuilder sb = new StringBuilder();
        int temp;

        int sayac = 0;
        int[] TelNo = new int[7];
        int[] AlanKod = {552, 553, 554, 555, 559, 501, 505, 506, 507, 551, 530, 531, 532, 533, 534, 535, 536, 537, 538, 539, 561, 540, 541, 542, 543, 544, 545, 546, 547, 548, 549};

        for (int i = 0; i < 31; i++) {
            temp = Secim.nextInt();
            AlanKod[i] = AlanKod[temp];
            if (i < 1) {
                sb.append(AlanKod[Secim.nextInt()]);
            }

        }

        for (int i = 0; i < 7; i++) {
            temp = Secim2.nextInt() + 1;
            TelNo[i] = temp;
            sb.append(TelNo[i]);
        }
        return sb.toString();
    }
}
