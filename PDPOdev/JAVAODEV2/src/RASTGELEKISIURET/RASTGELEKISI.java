/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RASTGELEKISIURET;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;

/**
 *
 * @author marsh
 */
public class RASTGELEKISI {
    SimpleRandom sr = new SimpleRandom(100);
    private int SatirSayisi;
    private BufferedReader br;
    private File file;

    public String RASTGELEKISI() {
        file = new File("random_isimler.txt");
        String Satir;
        SatirSayisi = 0;
        int Sayac = 0;
        try {

            br = new BufferedReader(new FileReader(file));

            Satir = br.readLine();

            while (Satir != null) {
                Sayac++;
                System.out.println(Satir);
              
                SatirSayisi++;
                if (Satir.length()>0) {
                    SatirSayisi++;
                }
                  Satir = br.readLine();
            }
        } catch (IOException e) {
          
        }

        int sayac = 0;
        String satir[] = new String[SatirSayisi + 1];
        try {

            br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            satir[0] = br.readLine();
            while (satir[sayac] != null) {
                if (satir[sayac].length() > 0) {
                    sayac++;
                }
                satir[sayac] = br.readLine();
            }
            br.close();
        } catch (IOException e) {
        }

        return satir[sr.nextInt()];
    }

}
