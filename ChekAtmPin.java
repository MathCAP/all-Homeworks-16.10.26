import java.util.Scanner;
public class ChekAtmPin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Atm Pin: ");
        int pin = scanner.nextInt();
        boolean Checker = false;
        System.out.println("Check your pin");

        int Attempts = 3;

        System.out.println("You have " + Attempts + " attempts to enter the password.");

        for (int attempt = 1; attempt <= Attempts; attempt++) {
            System.out.print("Attempt " + attempt + " - Enter password: ");
            int input = scanner.nextInt();

            if (input == pin) {
                Checker = true;
                break;
            } else {
                System.out.println("Incorrect password.");
            }
        }

        if (Checker) {
            System.out.println("Access granted! Welcome.");
        } else {
            System.out.println("Maximum attempts exceeded. Account locked.");
        }

    }
    }