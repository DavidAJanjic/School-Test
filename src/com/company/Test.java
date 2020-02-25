package com.company;

import java.io.*;
import java.util.*;

public class Test {
    private String kreatorTesta;
    private String nazivOblasti;
    private String predmet;
    private String institucija;
    private double maxBrPoena;
    private String datumKreiranjaTesta;
    private ArrayList<Pitanje> pitanja = new ArrayList<>();
    private ArrayList<Zadatak> zadatci = new ArrayList<>();
    private List<Student> polaznici = new ArrayList<>();
    private Scanner x;


    public Test() {
    }

    public Test(String kreatorTesta, String nazivOblasti, String predmet, String institucija,
                String datumKreiranjaTesta, ArrayList<Pitanje> pitanja, ArrayList<Zadatak> zadatci) {
        this.kreatorTesta = kreatorTesta;
        this.nazivOblasti = nazivOblasti;
        this.predmet = predmet;
        this.institucija = institucija;
        this.datumKreiranjaTesta = datumKreiranjaTesta;
        this.pitanja = pitanja;
        this.zadatci = zadatci;

    }

    public List<Student> getPolaznici() {
        return polaznici;
    }

    public void setPolaznici(ArrayList<Student> polaznici) {
        this.polaznici = polaznici;
    }

    public String getKreatorTesta() {
        return kreatorTesta;
    }

    public void setKreatorTesta(String kreatorTesta) {
        this.kreatorTesta = kreatorTesta;
    }

    public String getNazivOblasti() {
        return nazivOblasti;
    }

    public void setNazivOblasti(String nazivOblasti) {
        this.nazivOblasti = nazivOblasti;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public String getInstitucija() {
        return institucija;
    }

    public void setInstitucija(String institucija) {
        this.institucija = institucija;
    }

    public double getMaxBrPoena() {
        return maxBrPoena;
    }

    public void setMaxBrPoena(double maxBrPoena) {
        this.maxBrPoena = maxBrPoena;
    }

    public String getDatumKreiranjaTesta() {
        return datumKreiranjaTesta;
    }

    public void setDatumKreiranjaTesta(String datumKreiranjaTesta) {
        this.datumKreiranjaTesta = datumKreiranjaTesta;
    }

    public ArrayList<Pitanje> getPitanja() {
        return pitanja;
    }

    public void setPitanja(ArrayList<Pitanje> pitanja) {
        this.pitanja = pitanja;
    }

    public ArrayList<Zadatak> getZadatci() {
        return zadatci;
    }

    public void setZadatci(ArrayList<Zadatak> zadatci) {
        this.zadatci = zadatci;
    }

    public void proveriIspravnostTesta() {
        String tekst;
        for (int i = 0; i < pitanja.size(); i++) {
            tekst = pitanja.get(i).getTekstPitanja();
            for (int n = 0; n < zadatci.size(); n++) {
                if ((tekst.equals(zadatci.get(i).getTekstZadatka()))) {
                    System.out.println("Neispravan test! Tekstovi pitanja broj " + (i + 1) + ", i zadatka broj " + (n + 1) + " su isti");
                    break;
                }
            }
        }
        if (!(zadatci.size() == pitanja.size())) {
            System.out.println("Neispravan Test! Broj zadataka i pitanja NIJE jednak! Zadataka: " + zadatci.size() +
                    ". Pitanja: " + pitanja.size());

        } else {
            System.out.println("Test je ispravan!");
        }
    }

    public static String ispisTesta(Test test) {
        System.out.println("DATUM TESTA: " + test.getDatumKreiranjaTesta());
        System.out.println("USTANOVA: " + test.getInstitucija());
        System.out.println("PREDMET: " + test.getPredmet());
        System.out.println("OBLAST: " + test.getNazivOblasti());
        System.out.println();
        for (int i = 0; i < test.getPitanja().size(); i++) {
            //System.out.println((i+1) + ". " + pitanja.get(i).getTekstPitanja() + pitanja.get(i).getPonudjeniOdgovori()[i]);
            System.out.print((i + 1) + ". PITANJE.");
            test.getPitanja().get(i).ispisTest();
            System.out.println();
        }
        for (int i = 0; i < test.getZadatci().size(); i++) {
            System.out.println((i + 1) + ". ZADATAK.");
            test.getZadatci().get(i).ispisTest();
            System.out.println();
        }

        return " ";

    }

    public void ispisUFajl(String fajl) {
        try {
            PrintStream myconsole = new PrintStream(new File(fajl));
            System.setOut(myconsole);
            myconsole.print(ispisTesta(this));

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("Ispisano u fajl.");
    }
}

