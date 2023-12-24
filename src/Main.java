public class Main {
    public static void main(String[] args) {

        //Burada dairelerin adını, numarasını, hangi apartmana ait olduğunu tanımladık.
        Daire daire1 = new Daire("A", 1001, 1);
        Daire daire2 = new Daire("B", 2002, 1);
        Daire daire3 = new Daire("C", 3003, 1);
        Daire daire4 = new Daire("D", 4004, 1);
        Daire daire5 = new Daire("E", 5005, 1);

        //Binanın adını ve kat sayısını tanımladık.
        Bina bina = new Bina("Atamanlar Apt.", 5);


        EvSahibi evSahibi = new EvSahibi("Yüksel", "Uygun", bina); //Ev sahibini tanımladık

        //daireleri yazdırıyoruz
        evSahibi.addApartment(daire1);
        evSahibi.addApartment(daire2);
        evSahibi.addApartment(daire3);
        evSahibi.addApartment(daire4);
        evSahibi.addApartment(daire5);

        //Burada Kiracıların adını, soyadını,  tanımladık.
        Kiraci kiraci1 = new Kiraci("Salih", "Mercan", evSahibi);
        Kiraci kiraci2 = new Kiraci("Fatmagül", "Ilgaz", evSahibi);
        Kiraci kiraci3 = new Kiraci("Pınar" , "Atasay", evSahibi);
        Kiraci kiraci4 = new Kiraci("Safa" , "Gürpınar", evSahibi);
        Kiraci kiraci5 = new Kiraci("Gıyasettin" , "Keyhüsrev", evSahibi);

        //kiracıları dairelere atadık
        daire1.setKiraci(kiraci1);
        daire2.setKiraci(kiraci2);
        daire3.setKiraci(kiraci3);
        daire4.setKiraci(kiraci4);
        daire5.setKiraci(kiraci5);

        //tüm bilgileri göstermesini sağlar
        evSahibi.displayInfo();

    }
}
