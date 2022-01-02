package com.company.zadanie12;
import java.util.LinkedList;

public class zad3 {
    public static void main(String[] args) {
        LinkedList<String> nazwiska = new LinkedList<>();
        nazwiska.add("Kowalski");
        nazwiska.add("Nowak");
        nazwiska.add("Wiśniewski");
        nazwiska.add("Wójcik");
        nazwiska.add("Kowalczyk");
        nazwiska.add("Kamiński");
        System.out.println(nazwiska);
        odwroc(nazwiska);
        System.out.println(nazwiska);
    }
    public static void odwroc(LinkedList<String> lista){
        for(int i=0, j = lista.size()-1; i<j; i++){
            lista.add(i, lista.remove(j));
        }
    }
}
