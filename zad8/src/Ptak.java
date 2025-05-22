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

    @Override
    public String wydajDzwiek() {
        return "Ptak wydaje dzwiek ";
    }

    @Override
    public String poruszajSie() {
        return "Ptak sie porusza";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Powietrze";
    }


    public void upierzenie() {
        System.out.println("Upierzenie " + upierzenie);
    }
}
