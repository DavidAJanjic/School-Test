package com.company;

import java.util.SimpleTimeZone;

public class Pitanje {

    private String tekstPitanja;
    private String[] ponudjeniOdgovori;
    private int tacanOdgovor1;
    private boolean tacanOdgovor2;
    private String tacanOdgovor3;
    private double brojPoena;
    private int tipPitanja;
    private int odgovor1;
    private boolean odgovor2;
    private String odgovor3;
    private int brojLinijaPit;
    private int brojLinijaOdg;
    private double trenutniPoeni;

    public Pitanje() {
    }

    public Pitanje(String tekstPitanja, String[] ponudjeniOdgovori, int tacanOdgovor1, double brojPoena, int tipPitanja, int odgovor1) {
        this.tekstPitanja = tekstPitanja;
        this.ponudjeniOdgovori = ponudjeniOdgovori;
        this.tacanOdgovor1 = tacanOdgovor1;
        this.brojPoena = brojPoena;
        this.tipPitanja = tipPitanja;
        this.odgovor1 = odgovor1;

    }

    public Pitanje(String tekstPitanja, boolean tacanOdgovor2, double brojPoena, int tipPitanja, boolean odgovor2) {
        this.tekstPitanja = tekstPitanja;
        this.tacanOdgovor2 = tacanOdgovor2;
        this.brojPoena = brojPoena;
        this.tipPitanja = tipPitanja;
        this.odgovor2 = odgovor2;
    }

    public Pitanje(String tekstPitanja, String tacanOdgovor3, int brojLinijaPit, double brojPoena, int tipPitanja, String odgovor3, int brojLinijaOdg) {
        this.tekstPitanja = tekstPitanja;
        this.tacanOdgovor3 = tacanOdgovor3;
        this.brojLinijaPit = brojLinijaPit;
        this.brojPoena = brojPoena;
        this.tipPitanja = tipPitanja;
        this.odgovor3 = odgovor3;
        this.brojLinijaOdg = brojLinijaOdg;
    }

    public String getTekstPitanja() {
        return tekstPitanja;
    }

    public void setTekstPitanja(String tekstPitanja) {
        this.tekstPitanja = tekstPitanja;
    }

    public String[] getPonudjeniOdgovori() {
        return ponudjeniOdgovori;
    }

    public void setPonudjeniOdgovori(String[] ponudjeniOdgovori) {
        this.ponudjeniOdgovori = ponudjeniOdgovori;
    }

    public int getTacanOdgovor1() {
        return tacanOdgovor1;
    }

    public void setTacanOdgovor1(int tacanOdgovor1) {
        this.tacanOdgovor1 = tacanOdgovor1;
    }

    public boolean isTacanOdgovor2() {
        return tacanOdgovor2;
    }

    public void setTacanOdgovor2(boolean tacanOdgovor2) {
        this.tacanOdgovor2 = tacanOdgovor2;
    }

    public double getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(double brojPoena) {
        this.brojPoena = brojPoena;
    }

    public double getTrenutniPoeni() {
        return trenutniPoeni;
    }

    public void setTrenutniPoeni(double trenutniPoeni) {
        this.trenutniPoeni = trenutniPoeni;
    }

    public int getTipPitanja() {
        return tipPitanja;
    }

    public void setTipPitanja(int tipPitanja) {
        this.tipPitanja = tipPitanja;
    }

    public String getTacanOdgovor3() {
        return tacanOdgovor3;
    }

    public void setTacanOdgovor3(String tacanOdgovor3) {
        this.tacanOdgovor3 = tacanOdgovor3;
    }

    public int getBrojLinijaPit() {
        return brojLinijaPit;
    }

    public void setBrojLinijaPit(int brojLinija) {
        this.brojLinijaPit = brojLinija;
    }

    public int getBrojLinijaOdg() {
        return brojLinijaOdg;
    }

    public void setBrojLinijaOdg(int brojLinijaOdg) {
        this.brojLinijaOdg = brojLinijaOdg;
    }

    public int getOdgovor1() {
        return odgovor1;
    }

    public void setOdgovor1(int odgovor1) {
        this.odgovor1 = odgovor1;
    }

    public boolean isOdgovor2() {
        return odgovor2;
    }

    public void setOdgovor2(boolean odgovor2) {
        this.odgovor2 = odgovor2;
    }

    public String getOdgovor3() {
        return odgovor3;
    }

    public void setOdgovor3(String odgovor3) {
        this.odgovor3 = odgovor3;
    }

    public void ispis() {
        switch (tipPitanja) {
            case 1:
                System.out.println("\nPitanje glasi:\n" + tekstPitanja);
                System.out.println("\nPonudjeni odgovori su:");
                for (int i = 0; i < ponudjeniOdgovori.length; i++) {
                    System.out.println((i + 1) + ". " + ponudjeniOdgovori[i]);
                }

                if (odgovor1 == tacanOdgovor1) {
                    System.out.println(odgovor1);
                    System.out.println("Tacan odgovor! Zaradili ste " + brojPoena + " poena.");
                    trenutniPoeni = brojPoena;
                } else {
                    System.out.println(odgovor1);
                    System.out.println("Pogresan odgovor! Osvojili ste 0 poena.");
                    trenutniPoeni = 0;
                }
                break;
            case 2:
                System.out.println("\nPitanje glasi:\n" + tekstPitanja);
                System.out.println("\nDA");
                System.out.println("\nNE\n");
                if (odgovor2 == tacanOdgovor2) {
                    System.out.println(odgovor2);
                    System.out.println("Tacan odgovor! Zaradili ste " + brojPoena + " poena.");
                    trenutniPoeni = brojPoena;
                } else {
                    System.out.println(odgovor2);
                    System.out.println("Pogresan odgovor! Osvojili ste 0 poena.");
                    trenutniPoeni = 0;
                }
                break;
            case 3:
                System.out.println("\nPitanje glasi:\n" + tekstPitanja);
                for (int i = 0; i < getBrojLinijaPit(); i++) {
                    System.out.println("_________________________________________");
                }
                if (odgovor3.equals(tacanOdgovor3) & brojLinijaPit == brojLinijaOdg) {
                    System.out.println(odgovor3 + ". Broj linija odgovora: " + brojLinijaOdg);
                    System.out.println("Tacan odgovor! Zaradili ste " + brojPoena + " poena.");
                    trenutniPoeni = brojPoena;
                } else if (odgovor3.equals(tacanOdgovor3)) {
                    System.out.println(odgovor3 + ". Broj linija odgovora: " + brojLinijaOdg);
                    System.out.println("Tacan odgovor al nedovoljno linija! Zaradili ste " + brojPoena / 2 + " poena.");
                    trenutniPoeni = brojPoena / 2;
                } else {
                    System.out.println(odgovor3 + ". Broj linija odgovora: " + brojLinijaOdg);
                    System.out.println("Pogresan odgovor! Osvojili ste 0 poena.");
                    trenutniPoeni = 0;
                }
        }
    }

    public void ispisTest() {
        switch (tipPitanja) {
            case 1:
                System.out.println("\nPitanje glasi:\n" + tekstPitanja);
                //System.out.println("\nPonudjeni odgovori su:");
                for (int i = 0; i < ponudjeniOdgovori.length; i++) {
                    System.out.println((i + 1) + ". " + ponudjeniOdgovori[i]);
                }
                break;

            case 2:
                System.out.println("\nPitanje glasi:\n" + tekstPitanja);
                System.out.println("\nDA");
                System.out.println("\nNE");

                break;

            case 3:
                System.out.println("\nPitanje glasi:\n" + tekstPitanja);
                for (int i = 0; i < getBrojLinijaPit(); i++) {
                    System.out.println("_________________________________________");
                }
        }
    }
}
