package com.company;
import pl.imiajd.klos.Adres;
import pl.imiajd.klos.BetterRectangle;
import pl.imiajd.klos.Student;
import pl.imiajd.klos.Nauczyciel;
import pl.imiajd.klos.Punkt;
import pl.imiajd.klos.NazwanyPunkt;

public class zadanie7 {
    public static void main(String[] args){
        Adres adres = new Adres("Zamostowa", 7, "Koszalin", 11400);
        Adres adres2 = new Adres("Zamostowa", 4, 21, "Koszalin", 11400);
        adres.pokaz();
        adres2.pokaz();
        System.out.println(adres.przed(adres2));
        Student student = new Student("Adrian", 2000, "Nadleśnictwo");
        System.out.println(student.toString());
        Nauczyciel n = new Nauczyciel("Kowalski", 1939, 100000);
        System.out.println(n.toString());
        BetterRectangle r = new BetterRectangle(5, 1, 3, 4);
        System.out.println(r.getPerimeter());
        System.out.println(r.GetArea());
        NazwanyPunkt x = new NazwanyPunkt(8, 5, "Jeden");
        Punkt y = new Punkt(2, 7);
        Punkt z = new NazwanyPunkt(19, 1, "Dwa");
        System.out.println(x.getName());
        x.show();
        y.show();
        z.show();
    }
}
