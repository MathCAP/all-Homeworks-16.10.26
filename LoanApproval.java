import java.util.Scanner;
public class LoanApproval { public static void main(String[] args)
    { Scanner scanner = new Scanner(System.in);
    System.out.println(" Loan Approval System ");

    System.out.print("Age: ");
    int age = scanner.nextInt();

    System.out.print("Monthly income: ");
    int income = scanner.nextInt();

    System.out.print("Credit score (0-100): ");
    int score = scanner.nextInt();

    System.out.print("Years at current job: ");
    int years = scanner.nextInt();

    System.out.print("Existing debt (true/false): ");
    boolean debt = scanner.nextBoolean();

    boolean ageOk = age >= 21 && age <= 65;
    boolean incomeOk = income >= 30000;
    boolean scoreOk = score >= 70;
    boolean jobOk = years >= 2 || !debt;

    System.out.println();

    if (ageOk) {
        System.out.println("Age requirement: pass");
    } else {
        System.out.println("Age requirement: fail");
    }

    if (incomeOk) {
        System.out.println("Income requirement: pass");
    } else {
        System.out.println("Income requirement: fail");
    }

    if (scoreOk) {
        System.out.println("Credit score requirement: pass");
    } else {
        System.out.println("Credit score requirement: fail");
    }

    if (jobOk) {
        System.out.println("Job / debt requirement: pass");
    } else {
        System.out.println("Job / debt requirement: fail");
    }

    if (ageOk && incomeOk && scoreOk && jobOk) {
        System.out.println("Result: Loan Approved pass");
    } else {
        System.out.println("Result: Loan Rejected fail");
    }
}
}