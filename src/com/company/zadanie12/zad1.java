package com.company.zadanie12;
import java.util.LinkedList;

public class zad1 {
    public static void main(String[] args) {
        LinkedList<String> nazwiska = new LinkedList<>();
        nazwiska.add("Kowalski");
        nazwiska.add("Nowak");
        nazwiska.add("Wiśniewski");
        nazwiska.add("Wójcik");
        nazwiska.add("Kowalczyk");
        nazwiska.add("Kamiński");
        System.out.println(nazwiska);
        redukuj(nazwiska, 3);
        System.out.println(nazwiska);
    }
    public static void redukuj(LinkedList<String> pracownicy, int n){
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
