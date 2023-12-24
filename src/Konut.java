public abstract class Konut { //Konut sınıfı abstract sınıf olarak açıldı
    private String adres; //adres tanımlandı.

    //adresi yapıcı metotta kullandık.
    public Konut(String adres) {
        this.adres = adres;
    }

    //bilgileri göstermek için yapıcı metot kullandık.
    public void displayInfo() {
        System.out.println("Adres: " + adres);
    }
}
