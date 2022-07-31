import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = in.nextInt();
        int b = 0;
        for (int i = 2; i < a; i++) {

            if (a % i == 0) {
                b++;
            }

        }
        if (b == 0) {
            System.out.println("asaldır");
        } else {
            System.out.println("asal degildir");
        }
    }}
