package pl.imiajd.klos;
import java.time.*;

public class Pracownik extends Osoba2{
    public LocalDate dataZatrudnienia;

    public Pracownik(String[] imiona, LocalDate dataUrodzenia, boolean plec, LocalDate dataZatrudnienia){
        super(imiona, dataUrodzenia, plec);
        this.dataZatrudnienia = dataZatrudnienia;
    }
    public LocalDate getDataZatrudnienia(){
        return this.dataZatrudnienia;
    }
}