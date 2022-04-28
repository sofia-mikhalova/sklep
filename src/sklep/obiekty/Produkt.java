package sklep.obiekty;

public class Produkt {
    private String nazwa;

    private int cena;

    public String getNazwa() {
        return nazwa;
    }

    public int getCena() {
        return cena;
    }

    public Produkt(String nazwa, int cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                '}';
    }
}
