import java.util.Arrays;

public class StringReverse {
    public static String reverse(String string) {
        if (string == null || string.length() == 0) {
            return "";
        } else {
  StringBuilder sb = new StringBuilder();
          sb.append(string);
          return sb.reverse().toString();
    }}
    public static void main(String[] args) {
        String str="zafer arasan ne zaman adam olacak";
        String[] arr= str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length()%2 == 0) {
                arr[i]  = reverse(arr[i]);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
