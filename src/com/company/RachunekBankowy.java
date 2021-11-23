package com.company;

public class RachunekBankowy {
    public static double rocznaStopaProcentowa;
    private double saldo;

    RachunekBankowy(double saldo){
        this.saldo = saldo;


    }
    public void obliczMiesieczneOdsetki(double saldo){
        double odsetki = saldo * rocznaStopaProcentowa / 12;
        this.saldo += odsetki;
    }
    public void setrocznaStopaProcentowa(double rocznaStopaProcentowa) {
        RachunekBankowy.rocznaStopaProcentowa = rocznaStopaProcentowa;
    }
    public double print() {
        return saldo;
    }
}
