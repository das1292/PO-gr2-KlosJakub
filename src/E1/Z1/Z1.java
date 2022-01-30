package E1.Z1;
import java.math.BigInteger;
import java.util.*;
import java.lang.Comparable;
import java.time.LocalDate;

public class Z1{
    public static void main(String[]args){
        BigInteger[]sortedBigInts=new BigInteger[]{new BigInteger("-2001231123123123"),new BigInteger("1001239887391329312312")};
        BigInteger[]sortedunBigInts=new BigInteger[]{new BigInteger("101123123421344234555235523"),new BigInteger("-2021231231233312312")};
        LocalDate[]sortedDates=new LocalDate[]{
                LocalDate.of(2000,1,1),
                LocalDate.of(2010,10,11),
                LocalDate.of(2018,12,31),
                LocalDate.of(2020,3,23)
        };
        LocalDate[]sortedunDates=new LocalDate[]{
                LocalDate.of(2011,11,11),
                LocalDate.of(2015,9,1),
                LocalDate.of(2021,1,28),
                LocalDate.of(2018,4,21)
        };
        String[]sortedStrings=new String[]{"czesc","elo","siema"};
        String[]sortedunStrings=new String[]{"kox","ziom","naura"};
        System.out.println(ArrayUtil.isSorted(sortedBigInts));
        System.out.println(ArrayUtil.isSorted(sortedunBigInts));
        System.out.println(ArrayUtil.isSorted(sortedStrings));
        System.out.println(ArrayUtil.isSorted(sortedunStrings));
        System.out.println(ArrayUtil.isSorted(sortedDates));
        System.out.println(ArrayUtil.isSorted(sortedunDates));
    }

    static class ArrayUtil{
        public static <T extends Comparable<T>>boolean isSorted(T[]array){
            for(int i=0;i<array.length-1;i++)
                if(array[i+1].compareTo(array[i])<0){
                    return false;
                }
            return true;
        }
    }
}
