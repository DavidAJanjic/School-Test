package com.company;

public class Odgovor {
    private int tip;
    private int odgovor1;
    private boolean odgovor2;
    private String odgovor3;
    private int brojLinijaOdg;

    public Odgovor(int tip, int odgovor1) {
        this.tip = tip;
        this.odgovor1 = odgovor1;
    }

    public Odgovor(int tip, boolean odgovor2) {
        this.tip = tip;
        this.odgovor2 = odgovor2;
    }

    public Odgovor(int tip, String odgovor3, int brojLinijaOdg) {
        this.tip = tip;
        this.odgovor3 = odgovor3;
        this.brojLinijaOdg = brojLinijaOdg;
    }

    public int getBrojLinijaOdg() {
        return brojLinijaOdg;
    }

    public void setBrojLinijaOdg(int brojLinijaOdg) {
        this.brojLinijaOdg = brojLinijaOdg;
    }

    public int getTip() {
        return tip;
    }

    public void setTip(int tip) {
        this.tip = tip;
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
}
