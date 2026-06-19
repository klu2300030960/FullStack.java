import java.util.Scanner;

public class SpecialNumber {

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static int sumOfFactorials(int n) {
        if (n == 0) {
            return 0;
        }
        return factorial(n % 10) + sumOfFactorials(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num == sumOfFactorials(num)) {
            System.out.println(num + " is a Special Number");
        } else {
            System.out.println(num + " is not a Special Number");
        }

        sc.close();
    }
}