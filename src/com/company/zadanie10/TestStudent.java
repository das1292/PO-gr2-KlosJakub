package com.company.zadanie10;
import pl.imiajd.klos.zadanie10.Osoba;
import pl.imiajd.klos.zadanie10.Student;
import java.util.Collections;
import java.time.LocalDate;
import java.util.ArrayList;
import java.lang.Comparable;
import java.lang.Cloneable;

public class TestStudent{

    public static void main(String[] args){
        ArrayList<Osoba> grupa = new ArrayList<Osoba>();
        LocalDate data1 = LocalDate.of(2000, 11, 19);
        LocalDate data2 = LocalDate.of(2005, 03, 03);

        grupa.add(new Student("Klos", data1, 3.5));
        grupa.add(new Student("Nowak", data1, 4.1));
        grupa.add(new Student("Kowalski", data2, 5.7));
        grupa.add(new Student("Bąk", data2, 2.7));
        grupa.add(new Student("Kłos", data1, 4.1));

        System.out.println(grupa);
        Collections.sort(grupa);
        System.out.println(grupa);
    }
}
