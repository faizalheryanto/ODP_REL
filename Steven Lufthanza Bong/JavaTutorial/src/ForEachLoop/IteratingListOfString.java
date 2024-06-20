package ForEachLoop;

import java.util.Arrays;
import java.util.List;

public class IteratingListOfString {

    public static void main(String args[]) {
        List<String> names = Arrays.asList("James", "Larry", "Tom", "Lacy");

        for( String name : names ) {
            System.out.print( name );
            System.out.print(",");
        }
    }


}
