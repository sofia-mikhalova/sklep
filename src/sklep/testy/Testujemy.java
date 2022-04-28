package sklep.testy;

import java.util.ArrayList;

import sklep.obiekty.*;
import sklep.obiekty.Sklep;

public class Testujemy {
    public static void main(String[] args) {
        System.out.println("start");

//        Produkt produkt1 = new Produkt("Ser", 20);
//        Produkt produkt2 = new Produkt("Chleb", 4);

//        System.out.println(produkt1);
//        System.out.println(produkt2.getNazwa());
//        System.out.println(produkt2.getCena());


//        Koszyk koszyk1 = new Koszyk();
//        koszyk1.wkladanie(produkt1);
//        koszyk1.wkladanie(produkt2);
//
//        System.out.println(koszyk1);
//
//        koszyk1.wykladanie();
//
//        System.out.println(koszyk1);
//
//        Klient klient = new Klient("1111111111", koszyk1);
//        System.out.println(klient);
//

        Sklep sklep2 = new Sklep();
        System.out.println(sklep2.getListaProduktow());

        Koszyk koszyk2 = new Koszyk();
        Klient klient2 = new Klient("12312312312", koszyk2);

        koszyk2.wkladanie(sklep2.listaProduktow.get(1));
        koszyk2.wkladanie(sklep2.listaProduktow.get(0));

        Koszyk koszyk3 = new Koszyk();
        Klient klient3 = new Klient("99999999999", koszyk3);
        koszyk3.wkladanie(sklep2.listaProduktow.get(2));
        koszyk3.wkladanie(sklep2.listaProduktow.get(3));
        koszyk3.wkladanie(sklep2.listaProduktow.get(4));


        sklep2.kolejkaWejscie(klient2);
        sklep2.kolejkaWejscie(klient3);

//        System.out.println(sklep2.getKolejkaKlientow());

        System.out.println(klient2.getKoszykKlienta());
        System.out.println(sklep2.getWartoscKoszyka(koszyk2.getKoszyk()));
        sklep2.kolejkaWyjscie();
//        System.out.println(sklep2.getKolejkaKlientow());

//        System.out.println(sklep.getUtarg());
    }


}
