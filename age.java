
import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        double a = scanner.nextInt();
        if (a >= 18){
            System.out.println("Congratulations, you can vote");
        }
        else if (a < 18){
            System.out.println("You too young");
        }


    }
}
