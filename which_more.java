
import java.util.Scanner;

public class which_more {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("your first number: ");
        double a = scanner.nextInt();
        System.out.print("your second number: ");
        double b = scanner.nextInt();
        System.out.print("your third number: ");
        double c = scanner.nextInt();
        if (a>b & a>c){
            System.out.println("The greatest number is first");
        }
        else if (b>a & b>c){
            System.out.println("The greatest number is second");
        }
        else if (c>a & c>b){
            System.out.println("The greatest number is third");
        }
        else
            System.out.println("One of them is equal to another");
    }
}