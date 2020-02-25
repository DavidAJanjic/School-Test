package com.company;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.Scanner;

public class ReadFile {

    private static Scanner x;

    @NotNull
    public static Test ucitajTest(String fajl) {
        Test test = new Test();
        try {
            x = new Scanner(new File(fajl));
        } catch (Exception e) {
            System.out.println("Could not find file!");
        }
        String a;

        while (x.hasNext()) {
            a = x.next();
            if (a.equals("TESTA:")) {
                test.setDatumKreiranjaTesta(x.next());
                continue;
            }
            if (a.equals("USTANOVA:")) {
                test.setInstitucija(x.next());
                continue;
            }
            if (a.equals("PREDMET:")) {
                test.setPredmet(x.next());
                continue;
            }
            if (a.equals("OBLAST:")) {
                test.setNazivOblasti(x.next());
                continue;
            }

            if (a.equals("PITANJE.")) {
                Pitanje pitanje = new Pitanje();
                x.next();
                if (x.next().equals("glasi:")) {
                    String tekst = x.nextLine();
                    tekst = x.nextLine();
                    pitanje.setTekstPitanja(tekst);
                    if (x.next().endsWith(".")) {
                        String odgovori[] = new String[4];
                        for (int i = 0; i < odgovori.length; i++) {
                            String odg = x.next();
                            while (!(odg.endsWith("."))) {
                                odgovori[i] = odg;
                                odg = x.next();
                            }
                        }
                        pitanje.setPonudjeniOdgovori(odgovori);
                        pitanje.setTipPitanja(1);
                        test.getPitanja().add(pitanje);
                        continue;
                    }
                    String b = x.next();
                    if (b.equals("DA") | b.equals("NE")) {
                        pitanje.setTipPitanja(2);
                        test.getPitanja().add(pitanje);
                        continue;
                    }
                    if (b.endsWith("_")) {
                        pitanje.setTipPitanja(3);
                        pitanje.setBrojLinijaPit(1);
                        for (int i = 1; b.contains("_"); i++) {
                            pitanje.setBrojLinijaPit(1 + i);
                            b = x.next();
                        }
                        test.getPitanja().add(pitanje);
                    }
                }
            }

            if (a.equals("ZADATAK.")) {
                Zadatak zadatak = new Zadatak();
                x.next();
                if (x.next().endsWith("glasi:")) {
                    x.nextLine();
                    zadatak.setTekstZadatka(x.nextLine());
                    if (x.nextLine().endsWith("_")) {
                        int i = 1;
                        while (x.nextLine().endsWith("_")) {
                            i++;
                        }
                        zadatak.setBrojLinijaZad(i);
                    }
                    test.getZadatci().add(zadatak);
                }
            }


        }

        x.close();
        System.out.println("Test ucitan");
        return test;
    }

}
