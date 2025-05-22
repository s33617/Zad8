public class Ssak extends Zwierze {
    protected int waga;

    public Ssak(String nazwa, int wiek, int waga) {
        super(nazwa, wiek);
        this.waga = waga;
    }

    public int getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    @Override
    public String wydajDzwiek() {
        return "Ssak wydaje dzwiek";
    }

    @Override
    public String poruszajSie() {
        return "ssak porusza sie";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "lasy";
    }

    public void wagaSsaka() {
        System.out.println("Waga: " + waga);
    }
}
