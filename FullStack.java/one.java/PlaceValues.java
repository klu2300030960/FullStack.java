import java.util.Scanner;

public class PlaceValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int thousands = num / 1000;
        num = num % 1000;

        int hundreds = num / 100;
        num = num % 100;

        int tens = num / 10;
        int ones = num % 10;

        System.out.println("1000s : " + thousands);
        System.out.println("100s  : " + hundreds);
        System.out.println("10s   : " + tens);
        System.out.println("1s    : " + ones);

        sc.close();
    }
}