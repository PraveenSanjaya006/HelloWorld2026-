import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Prompt for first name
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();

        // Prompt for last name
        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();

        // Display welcome message
        System.out.println("Welcome to the Second Year " + firstName + " " + lastName);

        sc.close();
    }
}
