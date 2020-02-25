package com.company;

import java.util.ArrayList;

public class Student {
    private String ime;
    private ArrayList<Odgovor> odgovori = new ArrayList<>();

    public Student() {
    }

    public Student(String ime, ArrayList<Odgovor> odgovori) {
        this.ime = ime;
        this.odgovori = odgovori;
    }

    public Student(String ime, ArrayList<Odgovor> odgovori, double ostvareniPoeni) {
        this.ime = ime;
        this.odgovori = odgovori;

    }

    public ArrayList<Odgovor> getOdgovori() {
        return odgovori;
    }

    public void setOdgovori(ArrayList<Odgovor> odgovori) {
        this.odgovori = odgovori;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void uradiTest(Test test) {

        double ostvareniPoeni = 0;
        int i = 0;
        for (; i < test.getPitanja().size(); i++) {
            if ((test.getPitanja().get(i).getTipPitanja() == 1) & (odgovori.get(i).getTip() == 1)) {
                test.getPitanja().get(i).setOdgovor1(odgovori.get(i).getOdgovor1());
                test.getPitanja().get(i).ispis();
                ostvareniPoeni += test.getPitanja().get(i).getTrenutniPoeni();
            } else if ((test.getPitanja().get(i).getTipPitanja() == 2) & (odgovori.get(i).getTip() == 2)) {
                test.getPitanja().get(i).setOdgovor2(odgovori.get(i).isOdgovor2());
                test.getPitanja().get(i).ispis();
                ostvareniPoeni += test.getPitanja().get(i).getTrenutniPoeni();
            } else if ((test.getPitanja().get(i).getTipPitanja() == 3) & (odgovori.get(i).getTip() == 3)) {
                test.getPitanja().get(i).setOdgovor3(odgovori.get(i).getOdgovor3());
                test.getPitanja().get(i).setBrojLinijaOdg(odgovori.get(i).getBrojLinijaOdg());
                test.getPitanja().get(i).ispis();
                ostvareniPoeni += test.getPitanja().get(i).getTrenutniPoeni();
            }
        }
        for (int n = 0; n < test.getZadatci().size(); n++) {
            if (odgovori.get(i).getTip() == 4) {
                test.getZadatci().get(n).setOdgovor(odgovori.get(i).getOdgovor3());
                test.getZadatci().get(n).setBrojLinijaOdg(odgovori.get(i).getBrojLinijaOdg());
                test.getZadatci().get(n).ispis();
                ostvareniPoeni += test.getZadatci().get(n).getTrenutniPoeni();
            }
            i++;
        }
        Poeni poeni = new Poeni();
        poeni.setBrojPoena(ostvareniPoeni);
        poeni.setImeStudenta(this.ime);
        poeni.setTest(test);
        Statistika.getPoeniNaTestovima().add(poeni);
        test.getPolaznici().add(this);
        System.out.println();
        System.out.println("Ime Studenta: " + ime);
        System.out.println("\nUKUPAN BROJ OSVOJENIH POENA JE: | " + ostvareniPoeni + " |");

    }
}
