package com.company;
import java.util.Arrays;

public class IntegerSet {

    public boolean[] set;

    IntegerSet(){
        this.set = new boolean[100];
        Arrays.fill(this.set, false);
    }

    public static IntegerSet union(IntegerSet set1, IntegerSet set2){
        IntegerSet set = new IntegerSet();
        for(int i = 0; i<set1.set.length; i++){
            if (set1.set[i]  || set2.set[i]) set.set[i] = true;
            else set.set[i] = false;
        }
        return set;
    }

    public static IntegerSet intersection(IntegerSet set1,IntegerSet set2){

        IntegerSet set = new IntegerSet();
        for(int i = 0; i<set1.set.length; i++){
            if(set1.set[i]  && set2.set[i])
                set.set[i] = true;
            else
                set.set[i] = false;
        }
        return set;
    }

    public void insertElement(int n){
        if(n<=100)
            this.set[n-1] = true;

    }

    public void deleteElement(int n){
        if(n <= 100)
            this.set[n-1] = false;
    }

    public String toString(){
        String str = "";

        for(int i = 0; i < this.set.length; i++){
            if(this.set[i])
                str += i+1 + " ";

        }
        return str;
    }

    public  boolean equals(IntegerSet set2) {
        boolean spr = true;

        if (this.set.length == set2.set.length) {
            for (int i = 0; i < this.set.length; i++) {
                if (this.set[i] != set2.set[i])
                    spr = false;
            }
        }
        return spr;
    }
}
