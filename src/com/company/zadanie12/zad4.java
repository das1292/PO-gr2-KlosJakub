package com.company.zadanie12;
import java.util.LinkedList;

public class zad4 {
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
        LinkedList<Integer> liczby = new LinkedList<>();
        liczby.add(1);
        liczby.add(2);
        liczby.add(3);
        liczby.add(4);
        System.out.println(liczby);
        odwroc(liczby);
        System.out.println(liczby);
    }
    public static <T> void odwroc(LinkedList<T> lista){
        for(int i=0, j = lista.size()-1; i<j; i++){
            lista.add(i, lista.remove(j));
        }
    }
}
