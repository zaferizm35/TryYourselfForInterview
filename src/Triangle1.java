import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Triangle1 {
    public static void main(String[] args) {
        String str="zafer arasan ne zaman adam olacak";
        String[] arr= str.split(" ");

        Arrays.stream(arr).filter(p->p.contains("e")).forEach(System.out::println);


    }
}
