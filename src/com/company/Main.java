package com.company;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String[] odgovori = new String[4];
        odgovori[0] = "1944";
        odgovori[1] = "1943";
        odgovori[2] = "1942";
        odgovori[3] = "1941";

        Pitanje pitanje = new Pitanje("Kada je SAD usao u drugi svetski rat?", odgovori, 3, 5, 1, 3);
        Pitanje pitanje2 = new Pitanje("Moto komunizma je?", "Od svakog prema mogucnostima, svakom prema potrebi",
                2, 5, 3, "Od svakog prema mogucnostima, svakom prema potrebi", 1);
        Pitanje pitanje1 = new Pitanje("Da li je Japan u Aziji?", true, 5, 2, true);
        Zadatak zadatak = new Zadatak("Izracunati povrsinu pravugaonika ako je a = 10 i b = 8.", "80cm2",
                "80cm2", 10, 1, 1, true);
        Zadatak zadatak1 = new Zadatak("Formula za Silu glasi...?", "F=a*m", "F=Q*m",
                10, 1, 2, false);
        Zadatak zadatak2 = new Zadatak("Najveca drzava sveta je?", "Rusija", "Rusija",
                5, 1, 1, false);
        ArrayList<Zadatak> zadatci = new ArrayList<>();
        zadatci.add(zadatak);
        zadatci.add(zadatak1);
        zadatci.add(zadatak2);
        ArrayList<Pitanje> pitanja = new ArrayList<>();
        pitanja.add(pitanje);
        pitanja.add(pitanje1);
        pitanja.add(pitanje2);

        Odgovor odg1 = new Odgovor(1, 1);
        Odgovor odg2 = new Odgovor(2, true);
        Odgovor odg3 = new Odgovor(3, "Od svakog prema mogucnostima, svakom prema potrebi", 2);
        Odgovor odg4 = new Odgovor(4, "80cm2", 2);
        Odgovor odg5 = new Odgovor(4, "F=b*a", 1);
        Odgovor odg6 = new Odgovor(4, "Rusija", 1);

        Odgovor odg7 = new Odgovor(1, 2);
        Odgovor odg8 = new Odgovor(2, false);
        Odgovor odg9 = new Odgovor(3, "Od svakog prema mogucnostima, svakom prema potrebi", 1);
        Odgovor odg10 = new Odgovor(4, "80cm2", 1);
        Odgovor odg11 = new Odgovor(4, "F=a*m", 1);
        Odgovor odg12 = new Odgovor(4, "Rusija", 1);

        ArrayList<Odgovor> odgovori1 = new ArrayList<>();
        odgovori1.add(odg1);
        odgovori1.add(odg2);
        odgovori1.add(odg3);
        odgovori1.add(odg4);
        odgovori1.add(odg5);
        odgovori1.add(odg6);

        ArrayList<Odgovor> odgovori2 = new ArrayList<>();
        odgovori2.add(odg7);
        odgovori2.add(odg8);
        odgovori2.add(odg9);
        odgovori2.add(odg10);
        odgovori2.add(odg11);
        odgovori2.add(odg12);

        ArrayList<Odgovor> odgovori3 = new ArrayList<>();
        odgovori3.add(odg1);
        odgovori3.add(odg2);
        odgovori3.add(odg3);
        odgovori3.add(odg10);
        odgovori3.add(odg11);
        odgovori3.add(odg12);
/*
        pitanje.ispis();

        pitanje1.ispis();

        pitanje2.ispis();

        zadatak.ispis();
*/
        Test test = new Test();
        test.setDatumKreiranjaTesta("20-02-2020");
        test.setKreatorTesta("David");
        test.setInstitucija("OS Milica Pavlovic");
        test.setPredmet("Istorija");
        test.setNazivOblasti("Drugi svetski rat");
        test.setPitanja(pitanja);
        test.setZadatci(zadatci);

        Test test1 = new Test();
        test1.setDatumKreiranjaTesta("24-02-2020");
        test1.setKreatorTesta("Nikola");
        test1.setInstitucija("Gimnazija");
        test1.setPredmet("Programiranje");
        test1.setNazivOblasti("Sortiranje");
        test1.setPitanja(pitanja);
        test1.setZadatci(zadatci);


        test.proveriIspravnostTesta();

        Student student = new Student("David", odgovori1);
        Student student1 = new Student("Natalija", odgovori2);
        Student student2 = new Student("Gorcin", odgovori3);

        student2.uradiTest(test);
        System.out.println();
        student.uradiTest(test);
        System.out.println();
        student1.uradiTest(test);
        System.out.println();
        System.out.println("___________________________________________");
        System.out.println("___________________________________________");
        System.out.println("___________________________________________");
        System.out.println("___________________________________________");
        System.out.println();
        student2.uradiTest(test1);
        System.out.println();
        student.uradiTest(test1);
        System.out.println();
        student1.uradiTest(test1);

        System.out.println();
        Statistika.ispisiPolaznikeTesta(test);
        System.out.println();
        Statistika.ispisiPolaznikeTesta(test1);

        test1.ispisUFajl("C://Users/Quantox/Desktop/Test.txt");
        test.ispisUFajl("C://Users/Quantox/Desktop/Test24022020.txt");

        Test test2;
        test2 = ReadFile.ucitajTest("C://Users/Quantox/Desktop/Test24022020.txt");
        Test.ispisTesta(test2);

    }
}
