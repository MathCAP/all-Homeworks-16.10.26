import java.util.Scanner;
public class infinit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("your first number: ");
        int a = scanner.nextInt();

        int i = 1;
        while ( i != a ) {
            System.out.println(i);
            a = i++;
        }}}
