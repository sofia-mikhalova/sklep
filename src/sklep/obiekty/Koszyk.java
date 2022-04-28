package sklep.obiekty;

import java.util.ArrayList;

public class Koszyk {

    private ArrayList<Produkt> koszyk = new ArrayList<Produkt>();


    public void wkladanie(Produkt produkt) {
        koszyk.add(produkt);
    }

    public Produkt wykladanie() {
        if (koszyk.isEmpty()) {
            return null;
        }
        return koszyk.remove(0);

    }

    public ArrayList<Produkt> getKoszyk() {
        return koszyk;
    }

    @Override
    public String toString() {
        return "Koszyk{" +
                "koszyk=" + koszyk +
                '}';
    }
}
