package com.company;
import pl.imiajd.klos.*;
import java.time.*;

public class TestOsoba {
    public static void main(String[] args){
        String[] names = new String[2];
        names[0] = "Jakub";
        names[1] = "Grzegorz";
        LocalDate birth=LocalDate.of(2000, 11, 19);
        LocalDate hire=LocalDate.of(2021, 1, 1);

        Student2 s = new Student2(names,birth,true,4.3);
        System.out.println(s.getImiona()[0]);
        System.out.println(s.getPlec());
        System.out.println(s.getSredniaOcen());
        s.setSredniaOcen(4.1);
        System.out.println(s.getSredniaOcen());

        Pracownik p = new Pracownik(names, birth, true, hire);
        System.out.println(p.getImiona()[1]);
        System.out.println(p.getPlec());
        System.out.println(p.getDataZatrudnienia());
    }

}