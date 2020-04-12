
import javaodevi2.JavaOdevi2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author marsh
 */
public class denem1 {

    public static void main(String[] args) throws Exception {
        JavaOdevi2 yas = new JavaOdevi2(100);
        KimlikNo Kimlik = new KimlikNo();
        KimlikNo Kimlik2 = new KimlikNo();
        IMEINo imei = new IMEINo();
        Telefon KisiTel = new Telefon();
        String Satir;
        int Sayac = 0;
        Scanner Kisi = new Scanner(System.in);
        System.out.println("Üretilecek kişi sayısını giriniz : ");
        int UretKisi = Kisi.nextInt();
        System.out.println("Üretilecek kisi sayisi : " + UretKisi);
        File file = new File("random_isimler.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        Satir = br.readLine();
        while (Satir != null) {
            Sayac++;
            System.out.print("T.C NO : ");
            Kimlik.Uret();
            System.out.print(" ");
            System.out.print("  Adi : " + Satir + "  Yaş : " + yas.nextInt() + "  Telefon No : ");
            KisiTel.numara();
            System.out.print(" ");
            System.out.print("IMEI NO : ");
            imei.ImeiUret();
            System.out.print(" ");
            System.out.println();
            System.out.println("---------------------------------------------------");
            Satir = br.readLine().toLowerCase();

            if (Sayac > UretKisi - 1) {
                break;
            }
        }

    }

}
