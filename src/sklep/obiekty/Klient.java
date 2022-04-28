package sklep.obiekty;

public class Klient {
    private String identyfikator;

    private Koszyk koszyk;

    public String getIdentyfikator() {
        return identyfikator;
    }

    public Koszyk getKoszykKlienta() {
        return koszyk;
    }

    public Klient(String identyfikator, Koszyk koszyk) {
        this.identyfikator = identyfikator;
        this.koszyk = koszyk;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "identyfikator=" + identyfikator +
                ", koszyk=" + koszyk +
                '}';
    }
}
