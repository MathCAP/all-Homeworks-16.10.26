
import java.util.Scanner;

public class evenORodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("your first number: ");
        long a = scanner.nextLong();

        if (a % 2 != 0) {
            System.out.println("this number is odd");
        }
        else  {
            System.out.println("this number is even");
        }
    }
}