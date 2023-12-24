import java.util.ArrayList;
import java.util.List;

//Ev sahibinin isim, soyisim ve konutu daireleri private şekilde tanımlandı.
public class EvSahibi {
    private String isim;
    private String soyisim;
    private Konut konut;
    private List<Daire> daireler;

    //Ev sahibinin özellikleri yapıcı metotta tanımlandı.
    public EvSahibi(String isim, String soyisim, Konut konut) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.konut = konut;
        this.daireler = new ArrayList<>();
    }


    public void displayInfo() {
        System.out.println("Ev Sahibi: " + isim + " " + soyisim);
        konut.displayInfo();
        daireler.sort(null);  //dairelerin sıralanmasını sağlıyor.
        for (Daire daire : daireler) { //daireleri dönmeye başlar
            daire.displayInfo();
        }
    }

    public void addApartment(Daire daire) { //Daire eklememizi sağlar.
        daireler.add(daire);
    }
}
