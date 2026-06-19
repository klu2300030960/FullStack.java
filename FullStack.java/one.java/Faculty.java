import java.util.Scanner;

public class Faculty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Faculty Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Faculty ID: ");
        int id = sc.nextInt();

        System.out.println("\nFaculty Details");
        System.out.println("Faculty Name: " + name);
        System.out.println("Faculty ID: " + id);

        sc.close();
    }
}
