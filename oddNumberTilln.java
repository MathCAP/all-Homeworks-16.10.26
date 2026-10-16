import java.util.Scanner;
public class oddNumberTilln {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("All odd numbers till your number");
        System.out.print("your number: ");
        int a = scanner.nextInt();
        int i = 1;
        while (i != a) {
            System.out.println(i);
            i++;
            i++;
        }
        // do while

//        int i = 1;
//        do {
//            System.out.println(i);
//             i++;
        //     i++;
//        } while (i < a);

        //for while
//        for (int i = 1; i < a;i++ ; i++ )
//            System.out.println(a);
//
//    }
//}

    }}
