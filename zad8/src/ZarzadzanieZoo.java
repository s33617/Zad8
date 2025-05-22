public class ZarzadzanieZoo {
    public static void main(String[] args) {
        Ssak lew = new Ssak("Lew", 6, 30);
        Ptak orzel = new Ptak("Orzeł", 2, "białe");
        gad krokodyl = new gad("Krokodyl", 9, "łuskowana");

        System.out.println("SSAK");
        lew.wyswietlInformacje();
        lew.wagaSsaka();

        System.out.println("\nPTAK");
        orzel.wyswietlInformacje();
        orzel.upierzenie();


        System.out.println("\nGAD");
        krokodyl.wyswietlInformacje();
        krokodyl.typSkóry();

    }
}