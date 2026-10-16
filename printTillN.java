import java.util.Scanner;
public class printTillN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("your first number: ");
        int a = scanner.nextInt();
        // while

//        int i = 1;
//        while ( i != a ) {
//            System.out.println(i);
//             i++;
//        }

        // do while

//        int i = 1;
//        do {
//            System.out.println(i);
//             i++;
//        } while (i < a);

        //for while
        for (int i = 1; i < a;i++ )
            System.out.println(a);

    }
}
