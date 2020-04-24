

package RASTGELEKISIURET;

/**
 *
 */
public class kisi {

    SimpleRandom yas = new SimpleRandom(100);
    int Yas2=yas.nextInt()+1;
    KimlikNo Kimlik = new KimlikNo();
    IMEINo imei = new IMEINo();
    Telefon KisiTel = new Telefon();
    RASTGELEKISI YeniKisi = new RASTGELEKISI();
    String yazdir;
    String kimlikno;
    String Gonder;

    public String KisiOlustur() {
        
        Gonder = Kimlik.Uret() + " "+YeniKisi.RASTGELEKISI()+ " "+Yas2+ " " + KisiTel.numara() + " (" + imei.ImeiUret() + ")";
        return Gonder;
    }
    public String KimlikNoKontrol(String kimlik){
        KimlikNo KimlikKontrol = new KimlikNo();
        return KimlikKontrol.KimlikNoKontrol(kimlik);
    }
    public String ImeiKontrol(String imei){
        IMEINo imeiKontrol = new IMEINo();
        return imeiKontrol.İmeiKontrol(imei);
    }

}
