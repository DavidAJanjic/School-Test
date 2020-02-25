package com.company;

import java.util.ArrayList;

public class Poeni implements Comparable<Poeni> {
    private double brojPoena;
    private String imeStudenta;
    private Test test;

    public double getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(double brojPoena) {
        this.brojPoena = brojPoena;
    }

    public String getImeStudenta() {
        return imeStudenta;
    }

    public void setImeStudenta(String imeStudenta) {
        this.imeStudenta = imeStudenta;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    @Override
    public int compareTo(Poeni poeni) {
        if (this.getBrojPoena() < poeni.getBrojPoena()) {
            return 1;
        } else if (this.getBrojPoena() > poeni.getBrojPoena()) {
            return -1;
        }
        return 0;
    }
}
