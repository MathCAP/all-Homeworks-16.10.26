import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("All odd numbers till your number");
        System.out.print("your number: ");
        int a = scanner.nextInt();
        int i = 1;
        while (i < a) {

            i++;
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 ==0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }

        }
    }}