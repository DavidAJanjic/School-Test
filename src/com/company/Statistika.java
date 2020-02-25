package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Statistika {

    private static ArrayList<Poeni> poeniNaTestovima = new ArrayList<>();

    public static ArrayList<Poeni> getPoeniNaTestovima() {
        return poeniNaTestovima;
    }

    public static void setPoeniNaTestovima(ArrayList<Poeni> poeniNaTestovima) {
        Statistika.poeniNaTestovima = poeniNaTestovima;
    }

    public static void ispisiPolaznikeTesta(Test test) {
        ArrayList<Poeni> poeni = new ArrayList<>();
        for (int i = 0; i < poeniNaTestovima.size(); i++) {
            if (test == poeniNaTestovima.get(i).getTest()) {
                poeni.add(poeniNaTestovima.get(i));
            }
        }
        sortirajPoene(poeni);
        for (int i = 0; i < poeni.size(); i++) {
            System.out.println(poeni.get(i).getImeStudenta() + ": " + poeni.get(i).getBrojPoena());
        }

    }

    public static void sortirajPoene(ArrayList<Poeni> poeni) {
        Collections.sort(poeni);
    }
}
