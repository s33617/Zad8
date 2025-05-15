public class Ptak extends Zwierze {
    protected String upierzenie;

    public Ptak(String nazwa, int wiek, String upierzenie) {
        super(nazwa, wiek);
        this.upierzenie = upierzenie;
    }

    public String getUpierzenie() {
        return upierzenie;
    }

    public void setUpierzenie(String upierzenie) {
        this.upierzenie = upierzenie;
    }
}
