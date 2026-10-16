import java.util.Scanner;
public class GuessNum { public static void main(String[] args) { Scanner scan = new Scanner(System.in); int secret = 7;
    int pishut = 0;
    boolean ugadal = false;

    while (pishut < 5) {
        System.out.print("Enter your guess: ");
        int otvet = scan.nextInt();
        pishut = pishut + 1;

        if (otvet == secret) {
            System.out.println("Correct!");
            System.out.println("You needed " + pishut + " attempts.");
            ugadal = true;
            break;
        } else {
            if (otvet > secret) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }
        }
    }
    if (ugadal == false) {
        System.out.println("Game over!");
    }
}
}