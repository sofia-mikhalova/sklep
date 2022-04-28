package sklep.testy;

import sklep.obiekty.Klient;
import sklep.obiekty.Koszyk;
import sklep.obiekty.Produkt;
import sklep.obiekty.Sklep;

import java.util.ArrayList;

public class Symulacja {
    public static void main(String[] args) {
        System.out.println("Symulacja");

        ArrayList<Produkt> listaProduktow = new ArrayList<Produkt>() {
            {
                add(new Produkt("Chleb", 4));
                add(new Produkt("Ryba", 40));
                add(new Produkt("Ser", 20));
                add(new Produkt("Pomidor", 8));
                add(new Produkt("Czekolada", 6));
            }
        };
        Sklep sklep = new Sklep();


        Koszyk koszyk1 = new Koszyk();
        Koszyk koszyk2 = new Koszyk();
        Koszyk koszyk3 = new Koszyk();

        koszyk1.wkladanie(listaProduktow.get(0));
        koszyk1.wkladanie(listaProduktow.get(1));

        koszyk2.wkladanie(listaProduktow.get(2));

        koszyk3.wkladanie(listaProduktow.get(3));
        koszyk3.wkladanie(listaProduktow.get(4));

        Klient klient1 = new Klient("11111111111", koszyk1);
        Klient klient2 = new Klient("22222222222", koszyk2);
        Klient klient3 = new Klient("33333333333", koszyk3);

        sklep.kolejkaWejscie(klient1);
        sklep.kolejkaWejscie(klient2);
        sklep.kolejkaWejscie(klient3);

        System.out.println("Kolejka klientow: " + sklep.getKolejkaKlientow());

        System.out.println("Obslugujemy klientow: ");
        System.out.println("Klient 1: ");
        System.out.println("koszyk: " + klient1.getKoszykKlienta());
        System.out.println("cena: " + sklep.getWartoscKoszyka(koszyk1.getKoszyk()));
        sklep.setUtargCaly((sklep.getUtargCaly() + sklep.getWartoscKoszyka(koszyk1.getKoszyk())));
        sklep.kolejkaWyjscie();

        System.out.println("Obslugujemy klientow: ");
        System.out.println("Klient 2: ");
        System.out.println("koszyk: " + klient2.getKoszykKlienta());
        System.out.println("cena: " + sklep.getWartoscKoszyka(koszyk2.getKoszyk()));
        sklep.setUtargCaly((sklep.getUtargCaly() + sklep.getWartoscKoszyka(koszyk2.getKoszyk())));
        sklep.kolejkaWyjscie();

        System.out.println("Obslugujemy klientow: ");
        System.out.println("Klient 3: ");
        System.out.println("koszyk: " + klient3.getKoszykKlienta());
        System.out.println("cena: " + sklep.getWartoscKoszyka(koszyk3.getKoszyk()));
        sklep.setUtargCaly((sklep.getUtargCaly() + sklep.getWartoscKoszyka(koszyk3.getKoszyk())));
        sklep.kolejkaWyjscie();


        System.out.println("Utarg caly: " + sklep.getUtargCaly());

    }
}
