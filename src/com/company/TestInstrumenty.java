package com.company;
import pl.imiajd.klos.*;
import java.util.ArrayList;
import java.time.LocalDate;

public class TestInstrumenty {
    public static void main(String[] args){
        ArrayList<Instrument> orkiestra = new ArrayList<Instrument>();
        LocalDate data1 = LocalDate.of(2005, 5, 15);
        LocalDate data2 = LocalDate.of(2012, 7, 30);

        orkiestra.add(new Flet("A", data1));
        orkiestra.add(new Fortepian("B", data1));
        orkiestra.add(new Skrzypce("B", data2));
        orkiestra.add(new Skrzypce("C", data1));
        orkiestra.add(new Flet("D", data2));

        System.out.println(orkiestra.get(0).dzwiek());
        System.out.println(orkiestra.get(1).dzwiek());
        System.out.println(orkiestra.get(2).dzwiek());
        System.out.println(orkiestra.get(3).dzwiek());
        System.out.println(orkiestra.get(4).dzwiek());
        System.out.println(orkiestra);
    }
}
