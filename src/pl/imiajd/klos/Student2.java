package pl.imiajd.klos;
import java.time.*;

public class Student2 extends Osoba2{
    public double sredniaOcen;
    public Student2(String[] imiona, LocalDate dataUrodzenia, boolean plec, double sredniaOcen){
        super(imiona, dataUrodzenia, plec);
        this.sredniaOcen = sredniaOcen;
    }
    public void setSredniaOcen(double nowaSrednia){
        this.sredniaOcen = nowaSrednia;
    }
    public double getSredniaOcen(){
        return this.sredniaOcen;
    }

}
