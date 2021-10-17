package com.company;

        import java.util.Scanner;

        import static java.lang.Math.*;

public class zadania2 {
    public static void main(String[] args) {

//        zad1
        double wynik;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        double[] liczby = new double[n];
//        zad1a
        wynik = 0;
        for(int i = 0; i<=liczby.length-1; i++) {
            liczby[i] = scn.nextDouble();
            wynik+=liczby[i];
        }
        System.out.println(wynik);

//        zad1b

        wynik = 1;
        for(int i = 0; i<=liczby.length-1; i++) {
            liczby[i] = scn.nextDouble();
            wynik*=liczby[i];
        }
        System.out.println(wynik);
//        zad1c
        wynik = 0;
        for(int i = 0; i<=liczby.length-1; i++) {
            liczby[i] = scn.nextDouble();
            wynik+=abs(liczby[i]);
        }
        System.out.println(wynik);

//        zad1d

        wynik = 0;
        for(int i = 0; i<=liczby.length-1; i++) {
            liczby[i] = scn.nextDouble();
            wynik+=sqrt(abs(liczby[i]));
        }
        System.out.println(wynik);
//        zad1e
        wynik = 1;
        for(int i = 0; i<=liczby.length-1; i++) {
            liczby[i] = scn.nextDouble();
            wynik*=abs(liczby[i]);
        }
        System.out.println(wynik);

//        zad1f
        wynik = 0;
        for(int i = 0; i<=liczby.length-1; i++) {
            liczby[i] = scn.nextDouble();
            wynik+=pow(liczby[i], 2);
        }
        System.out.println(wynik);
//        zad1g
        wynik = 0;
        double wynik2 = 1;
        for(int i = 0; i<=liczby.length-1; i++) {
            liczby[i] = scn.nextDouble();
            wynik+=liczby[i];
            wynik2*=liczby[i];
        }
        System.out.println(wynik + "\n"+wynik2);
//        zad1h
        wynik = 0;
        for(int i = 0; i<=liczby.length-1; i++){
            liczby[i] = scn.nextDouble();
        }
        for(int i = 0; i<=liczby.length-1; i++) {
            wynik+=pow(-1, i+1)*liczby[i];
        }
        System.out.println(wynik);

//        zad1i
        wynik = 0;
        int factorial = 1;
        for(int i = 0; i<=liczby.length-1; i++){
            liczby[i] = scn.nextDouble();
        }
        for(int i = 0; i<=liczby.length-1; i++) {

            factorial*=i+1;
            wynik+=(pow(-1, i)*liczby[i])/factorial;
        }
        System.out.println(wynik);
//        zad1.2
        double[] liczby2 = new double[n];

        for(int i = 0; i<=liczby.length-1; i++){
            liczby[i] = scn.nextDouble();
        }
        double jeden = liczby[0];
        for(int i = 0; i<=liczby.length-2; i++) {

            liczby2[i] = liczby[i+1];


        }
        System.out.println("\n\n\n");
        liczby2[liczby2.length-1] = jeden;
        for(int i = 0; i <=liczby2.length-1; i++){
            System.out.println(liczby2[i]);
        }

//        Zad2.1
//        zad2a
        int counter = 0;

        for(int i = 0; i<=liczby.length-1; i++){
            liczby[i] = scn.nextDouble();
            if(liczby[i] %2 != 0)
                counter++;
        }
        System.out.println(counter);

//        zad2b


        for(int i = 0; i<=liczby.length-1; i++){
            liczby[i] = scn.nextDouble();
            if(liczby[i] %3 == 0 && liczby[i]%5!=0)
                counter++;
        }
        System.out.println(counter);

//        zad2c

        for(int i = 0; i<=liczby.length-1; i++){
            liczby[i] = scn.nextDouble();
            if(sqrt(liczby[i]) %2 == 0)
                counter++;
        }
        System.out.println(counter);

//        zad2d
        for(int i = 0; i<=liczby.length-1; i++) {
            liczby[i] = scn.nextDouble();

        }
        for(int i = 1; i<=liczby.length-2; i++){
            if(liczby[i] < (liczby[i-1]+liczby[i+1])/2)
                counter++;
        }
        System.out.println(counter);

//        zad2e
        int fact = 1;
        for (int i = 0; i <= liczby.length - 1; i++) {
            liczby[i] = scn.nextDouble();


        }
        for (int i = 1; i <= liczby.length - 1; i++) {
            fact *= i;
            if (pow(2, i) <= liczby[i] && liczby[i] <= fact)
                counter++;
        }
        System.out.println(counter);

//        zad2f
        for(int i = 0; i<=liczby.length-1; i++){
            liczby[i] = scn.nextDouble();
            if(i+1%2 != 0 && liczby[i]%2==0)
                counter++;
        }
        System.out.println(counter);

        for(int i = 0; i<=liczby.length-1; i++){
            liczby[i] = scn.nextDouble();
            if(liczby[i] %2 !=0 && liczby[i] >=0)
                counter++;
        }
        System.out.println(counter);
        for(int i = 0; i<=liczby.length-1; i++){
            liczby[i] = scn.nextDouble();
            if(abs(liczby[i]) < pow(i, 2))
                counter++;
        }
        System.out.println(counter);

//        zad2.2
        for(int i = 0; i<=liczby.length-1; i++){
            liczby[i] = scn.nextDouble();
            if(liczby[i] > 0)
                counter+=2*liczby[i];
        }
        System.out.println(counter);
//        zad2.3
        int zeros = 0, plus = 0, minus = 0;
        for(int i = 0; i<=liczby.length-1; i++){
            liczby[i] = scn.nextDouble();
            if(liczby[i] == 0)
                zeros++;
            if(liczby[i] < 0)
                minus++;
            if(liczby[i] > 0)
                plus++;
        }
        System.out.println(counter);
//        zad2.4
        double max, min;

        for(int i = 0; i<=liczby.length-1; i++){
            liczby[i] = scn.nextDouble();

        }
        min = liczby[0];
        max = liczby[0];
        for(int i = 0; i<=liczby.length-1;i++)
            if(i > 0) {
                if (liczby[i] > max)
                    max = liczby[i];
                if(liczby[i] < min)
                    min = liczby[i];
            }

        System.out.println(min+ "\n" + max);

//        zad2.5

        for(int i = 0; i<=liczby.length-1; i++){
            liczby[i] = scn.nextDouble();

        }
        for(int i = 0; i<=liczby.length-2;i++){


            if(liczby[i] > 0 && liczby[i+1] > 0)
                counter++;
        }

        System.out.println(counter);


    }



}
