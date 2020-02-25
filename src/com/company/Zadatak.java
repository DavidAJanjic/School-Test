package com.company;

public class Zadatak {
    private String tekstZadatka;
    private String tacanOdgovor;
    private String odgovor;
    private double brojPoena;
    private double trenutniPoeni;
    private int brojLinijaZad;
    private int brojLinijaOdg;
    private boolean dozvoljenKalkulator;


    public Zadatak() {
    }

    public Zadatak(String tekstZadatka, String tacanOdgovor, String odgovor, double brojPoena, int brojLinijaZad, int brojLinijaOdg, boolean dozvoljenKalkulator) {
        this.tekstZadatka = tekstZadatka;
        this.tacanOdgovor = tacanOdgovor;
        this.odgovor = odgovor;
        this.brojPoena = brojPoena;
        this.brojLinijaZad = brojLinijaZad;
        this.brojLinijaOdg = brojLinijaOdg;
        this.dozvoljenKalkulator = dozvoljenKalkulator;
    }

    public String getTekstZadatka() {
        return tekstZadatka;
    }

    public void setTekstZadatka(String tekstZadatka) {
        this.tekstZadatka = tekstZadatka;
    }


    public void setOdgovor(String odgovor) {
        this.odgovor = odgovor;
    }

    public int getBrojLinijaZad() {
        return brojLinijaZad;
    }

    public void setBrojLinijaZad(int brojLinijaZad) {
        this.brojLinijaZad = brojLinijaZad;
    }

    public void setBrojLinijaOdg(int brojLinijaOdg) {
        this.brojLinijaOdg = brojLinijaOdg;
    }

    public double getTrenutniPoeni() {
        return trenutniPoeni;
    }

    public boolean isDozvoljenKalkulator() {
        return dozvoljenKalkulator;
    }

    public void ispis() {
        System.out.println("\nZadatak glasi: \n" + tekstZadatka);
        for (int i = 0; i < getBrojLinijaZad(); i++) {
            System.out.println("_________________________________________");
        }
        if (odgovor.equals(tacanOdgovor) & brojLinijaOdg == brojLinijaZad) {
            System.out.println("Vas odgovor: " + odgovor + ". Vas broj linija: " + brojLinijaOdg);
            System.out.println("Tacan odgovor! Zaradili ste " + brojPoena + " poena.");
            trenutniPoeni = brojPoena;
        } else if (odgovor.equals(tacanOdgovor)) {
            System.out.println("Vas odgovor: " + odgovor + ". Vas broj linija: " + brojLinijaOdg);
            System.out.println("Tacan odgovor, al niste ispratili druga pravila zadatka. Zaradili ste " + brojPoena / 2 + " poena.");
            trenutniPoeni = brojPoena / 2;
        } else {
            System.out.println("Vas odgovor " + odgovor + ". Vas broj linija: " + brojLinijaOdg);
            System.out.println("Netacan odgovor! Zaradili ste 0 poena.");
            trenutniPoeni = 0;
        }
    }

    public void ispisTest() {
        if (isDozvoljenKalkulator()) {
            tekstZadatka = tekstZadatka.concat(" (K)");
        }
        System.out.println("\nZadatak glasi: \n" + tekstZadatka);
        for (int i = 0; i < getBrojLinijaZad(); i++) {
            System.out.println("_________________________________________");
        }
    }

}
