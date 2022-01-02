package com.company.zadanie12;
import java.util.LinkedList;

public class zad2 {
    public static void main(String[] args) {
        LinkedList<String> nazwiska = new LinkedList<>();
        nazwiska.add("Kowalski");
        nazwiska.add("Nowak");
        nazwiska.add("Wiśniewski");
        nazwiska.add("Wójcik");
        nazwiska.add("Kowalczyk");
        nazwiska.add("Kamiński");
        System.out.println(nazwiska);
        redukuj(nazwiska, 2);
        System.out.println(nazwiska);
        LinkedList<Integer> liczby = new LinkedList<>();
        liczby.add(1);
        liczby.add(2);
        liczby.add(3);
        liczby.add(4);
        System.out.println(liczby);
        redukuj(liczby, 3);
        System.out.println(liczby);
    }
    public static <T> void redukuj(LinkedList<T> pracownicy, int n){
        int counter = 0;
        for(int i=0; i<pracownicy.size();i++){
            counter += 1;
            if(counter == n){
                pracownicy.remove(i);
                counter = 1;
            }
        }
    }
}
