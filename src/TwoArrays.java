import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoArrays {

    private static int n;
    private static int n1;

    public static  void main(String[] args) {
        int [] a ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int [] b ={1, 2, 3, 4, 5, 6, 7,8, 9, 10, 11, 12, 13,14};

         int c= Arrays.mismatch(a,b);
        System.out.println("Arrays.compare(a,b) = " + Arrays.compare(a, b));

        Arrays.stream(a).distinct().filter(value -> value%5==0).forEach(System.out::println);
        BiFunction f= new BiFunction<>() {
            @Override
            public Object apply(Object o, Object o2) {
                return null;
            }
        };

        System.out.println(b[c]);

        for (int i = 0; i < 5; i++) {
            System.out.println("*".repeat(i));
            for (int j = 0; j < 5; j++) {
                System.out.print(" ");
            }
        }

    }
}
