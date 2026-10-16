import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Grading System ");

        System.out.print("Enter attendance points (max 10): ");
        int attendance = scanner.nextInt();

        System.out.print("Enter homework points (max 60): ");
        int homework = scanner.nextInt();

        System.out.print("Enter exam points (max 30): ");
        int exam = scanner.nextInt();


        if (attendance < 0 || attendance > 10 || homework < 0 || homework > 60 || exam < 0 || exam > 30) {
            System.out.println("Wrong input! Please check the maximum points.");
            return;
        }

        int total = attendance + homework + exam;
        System.out.println("Total points: " + total);

        if (total > 65 && attendance >= 6 && exam >= 17) {
            System.out.println("Result: PASSED");
        } else {
            System.out.println("Result: FAILED");
            if (total <= 65) {
                System.out.println("Reason: total points must be more than 65");
            }
            if (attendance < 6) {
                System.out.println("Reason: attendance must be at least 6");
            }
            if (exam < 17) {
                System.out.println("Reason: exam must be at least 17");
            }
        }
    }
}
