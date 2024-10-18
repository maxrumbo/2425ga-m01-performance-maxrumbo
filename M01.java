// 12S24037 - Maxwell Rumahorbo
// 12S24030 - Swasti Sihombing

import java.util.*;
import java.lang.Math;

public class M01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double nilaiAngka, kreditAngka, performa;
        String kredit, nilaiHuruf;

        kreditAngka = 0;
        kredit = input.nextLine();
        while (!kredit.equals("---")) {
            if (kredit.equals("---")) {
                kredit = kredit;
            } else {
                kreditAngka = Integer.parseInt(kredit);
            }
            nilaiHuruf = input.nextLine();
            if (nilaiHuruf.equals("A")) {
                nilaiAngka = 4.0;
            } else {
                if (nilaiHuruf.equals("AB")) {
                    nilaiAngka = 3.5;
                } else {
                    if (nilaiHuruf.equals("B")) {
                        nilaiAngka = 3.0;
                    } else {
                        if (nilaiHuruf.equals("BC")) {
                            nilaiAngka = 2.5;
                        } else {
                            if (nilaiHuruf.equals("C")) {
                                nilaiAngka = 2.0;
                            } else {
                                if (nilaiHuruf.equals("D")) {
                                    nilaiAngka = 1.0;
                                } else {
                                    if (nilaiHuruf.equals("E")) {
                                        nilaiAngka = 0.0;
                                    } else {
                                        nilaiAngka = 0.0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            performa = kreditAngka * nilaiAngka;
            System.out.println(toFixed(performa,1));
            kredit = input.nextLine();
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
