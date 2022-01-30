package E1.Z2;

import java.math.BigInteger;
import java.util.stream.Stream;
import java.util.Arrays;

public class Z2 {
    public static void main(String[]args){
        Arrays.stream(IntSequence.of(3,1,4,1,5,9).toArray()).forEach(System.out::print);
        System.out.println();
        Arrays.stream(IntSequence.squeres((long)3).toArray()).forEach(obj->System.out.print("["+obj+"]"));
        System.out.println();
    }

    public interface IntSequence{

    static Stream<Integer> of(Integer...x){
        Stream<Integer> stream1=Stream.of(x);
        Stream<Integer> stream2=Stream.iterate(1,i->1).limit(100);
        return Stream.concat(stream1,stream2);
    }

    static Stream<BigInteger> squeres(Long x){
        Stream<BigInteger>stream3=Stream.iterate(BigInteger.valueOf(x),i->i.add(BigInteger.ONE)).map(i->i.multiply(i)).limit(10);
        return stream3;
    }
    }
}
