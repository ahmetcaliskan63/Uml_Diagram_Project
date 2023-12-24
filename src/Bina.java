public class Bina extends Konut { //Bina sınıfı konut sınıfına extends edildi.
    private int numberOfFloors; //kat sayısı tanımlandı.

    //Binanın yapıcı metodunu oluşturduk.
    public Bina(String binaAdi, int numberOfFloors) {
        super("Artvin/Borçka Aksu Mah. Cumhuriyet Sok. Ataman Apt.");
        this.numberOfFloors = numberOfFloors;
    }

    //displayInfo override edildi
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bina, Kat Sayısı: " + numberOfFloors);
    }
}
