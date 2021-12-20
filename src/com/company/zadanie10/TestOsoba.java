package com.company.zadanie10;
import pl.imiajd.klos.zadanie10.Osoba;
import java.util.Collections;
import java.time.LocalDate;
import java.util.ArrayList;
import java.lang.Comparable;
import java.lang.Cloneable;

public class TestOsoba{

    public static void main(String[] args){
        ArrayList<Osoba> grupa = new ArrayList<Osoba>();
        LocalDate data1 = LocalDate.of(2000, 11, 19);
        LocalDate data2 = LocalDate.of(2005, 03, 03);

        grupa.add(new Osoba("Klos", data1));
        grupa.add(new Osoba("Nowak", data1));
        grupa.add(new Osoba("Kowalski", data2));
        grupa.add(new Osoba("Bąk", data2));
        grupa.add(new Osoba("Kłos", data1));

        System.out.println(grupa);
        Collections.sort(grupa);
        System.out.println(grupa);
    }
}
