package sklep.obiekty;

import java.util.ArrayList;

public class Sklep {
    public ArrayList<Produkt> listaProduktow = new ArrayList<Produkt>();

    public ArrayList<Klient> kolejkaKlientow = new ArrayList<Klient>();


    public int utargCaly = 0;

    public void kolejkaWejscie(Klient klient) {
        kolejkaKlientow.add(klient);
    }

    public Klient kolejkaWyjscie() {
        if (kolejkaKlientow.isEmpty()) {
            return null;
        }

        return kolejkaKlientow.remove(0);

    }

    public void setUtargCaly(int utargCaly) {
        this.utargCaly = utargCaly;
    }

    public ArrayList<Produkt> getListaProduktow() {
        return listaProduktow;
    }

    public int getWartoscKoszyka(ArrayList<Produkt> koszyk) {
        int wynik = 0;
        for (Produkt produkt : koszyk) {
            int cena = produkt.getCena();
            wynik = wynik + cena;
        }
        return wynik;
    }

    public ArrayList<Klient> getKolejkaKlientow() {
        return kolejkaKlientow;
    }

    public int getUtargCaly() {
        return utargCaly;
    }


    @Override
    public String toString() {
        return "Sklep{" +
                "listaProduktow=" + listaProduktow +
                ", kolejkaKlientow=" + kolejkaKlientow +
                ", utargCaly=" + utargCaly +
                '}';
    }
}
