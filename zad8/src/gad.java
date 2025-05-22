public class gad extends Zwierze {
    protected String typSkóry;

    public gad(String nazwa, int wiek, String typSkóry) {
        super(nazwa, wiek);
        this.typSkóry = typSkóry;
    }

    public String getTypSkóry() {
        return typSkóry;
    }

    public void setTypSkóry(String typSkóry) {
        this.typSkóry = typSkóry;
    }

    @Override
    public String wydajDzwiek() {
        return "gad wydaje dzwiek";
    }

    @Override
    public String poruszajSie() {
        return "gad sie porusza";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "tereny suche";
    }

    public void typSkóry() {
        System.out.println("typ skóry: " + typSkóry);
    }
}
