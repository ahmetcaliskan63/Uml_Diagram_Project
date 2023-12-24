public class Daire extends Konut implements Comparable<Daire> { //daire konuta extends edildi ve comparable interfacesine implements edildi.

    // Dairenin adı, numarası, ve apartman numarası ile kiracısını tanımladık.
    private String daireAdi;
    private int daireNo;
    private int apartmanNo;
    private Kiraci kiraci;

    //Dairenin özellikleri yapıcı metoda atandı.
    public Daire(String daireAdi, int daireNo, int apartmanNo) {
        super("Belirtilmemiş Adres");
        this.daireAdi = daireAdi;
        this.daireNo = daireNo;
        this.apartmanNo = apartmanNo;
    }

    //Kiracının ismini set ettik yani değiştirilebilir kıldık.
    public void setKiraci(Kiraci kiraci) {
        this.kiraci = kiraci;
    }

    //displayInfo yapıcı metodunun içinde daire özellikleri eklendi
    public void displayInfo() {
        System.out.println("Daire: " + daireAdi + ", No: " + daireNo + ", Apartman No: " + apartmanNo);
        if (kiraci != null) { //kiracı eğer var ise kiracı özellikleri yazdırılsın eğer yoksa else kısmı çalışsın.
            System.out.println("Kiracı: " + kiraci.getIsim() + " " + kiraci.getSoyisim());
        } else {
            System.out.println("Kiracı: Belirtilmemiş");
        }
    }
    //daire sınıfında override edildi.
    @Override
    public int compareTo(Daire otherDaire) {
        return Integer.compare(this.daireNo, otherDaire.daireNo);
    }
}
