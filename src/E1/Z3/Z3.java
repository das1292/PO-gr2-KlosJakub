package E1.Z3;

import java.io.File;
import java.util.Arrays;
import java.util.Objects;

public class Z3 {
    public static void main(String[]args){
        File file=new File("src/");
        String[] st= file.list();
        Arrays.stream(st).map(i->{if (!i.contains(".txt"))return i;return null;}).filter(Objects::nonNull).forEach(System.out::println);
    }
}
