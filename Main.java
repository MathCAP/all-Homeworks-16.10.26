import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your operation: [+] [-] [*] [/] [%] ");
        String oper = scanner.next();

        System.out.print("your first number: ");
        double a = scanner.nextInt();

        System.out.print("your second number: ");
        double b = scanner.nextInt();

        if ( oper.equals("+")) {
            System.out.println("Operation is addition");
            System.out.println("Result: " + (a + b ));
        } else if (oper.equals("-")) {
            System.out.println("Operation is substraction");
            System.out.println("Result: " + (a - b ));
        }
        else if (oper.equals("*")) {
            System.out.println("Operation is multiply");
            System.out.println("Result: " + (a * b));
        }
        else if (oper.equals("/")) {
            if (b == 0){
                System.out.println("Number cannot be divided by 0");
            }
            else {
                System.out.println("Operation is division");
                System.out.println("Result: " + (a / b));
            }
        }
        else System.out.println("uncoorrect opperation");

    }
}