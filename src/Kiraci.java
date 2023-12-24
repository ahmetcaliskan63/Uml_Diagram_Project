public class Kiraci {

    //Kiracının isim, soyisim ve ev sahibi private şekilde tanımlandı.
    private String isim;
    private String soyisim;
    private EvSahibi evSahibi;

    //Kiracinin özellikleri yapıcı metoda atandı
    public Kiraci(String isim, String soyisim, EvSahibi evSahibi) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.evSahibi = evSahibi;
    }

    //Kiracının isim ve soyismi yazdırıldı.
    public void displayInfo() {
        System.out.println("Kiracı: " + isim + " " + soyisim);
    }

    //kiracının ismini get ettik yani okunmasını sağladık
    public String getIsim() {
        return isim;
    }

    //kiracının soyismini get ettik yani okunmasını sağladık
    public String getSoyisim() {
        return soyisim;
    }
}
