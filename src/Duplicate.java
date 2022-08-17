import java.util.Arrays;

public class Duplicate {
    public static int con(String[] s , String s1){
        int a=0;
        for (int i = 0; i < s.length; i++) {
            if(s[i].equalsIgnoreCase(s1)) a++;
        }


        return a;
    }

    public static void main(String[] args) {

        String str="Java String python java String kalem wooden spoon muhtar oscar java Java String python java String kalem wooden spoon string";
        String[] arr= str.split(" ");
        System.out.println(Arrays.toString(arr));
        int count=0;






    }
}
