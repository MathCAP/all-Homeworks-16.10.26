import java.util.Scanner;
public class DiscountCalculator { public static void main(String[] args)
    { Scanner scanner = new Scanner(System.in);
    System.out.println(" Online Store Discount Calculator ");
    System.out.print("Purchase amount: $");
    double amount = scanner.nextDouble();
    System.out.print("Premium member (true/false): ");
    boolean premium = scanner.nextBoolean();
    System.out.print("Number of previous orders: ");
    int orders = scanner.nextInt();
    System.out.print("Discount coupon (true/false): ");
    boolean coupon = scanner.nextBoolean();
    System.out.print("Birthday month (true/false): ");
    boolean birthday = scanner.nextBoolean();

    int discount = 0;

    if (amount < 20) {
        discount = 0;
    } else if (amount >= 200 && premium && (coupon || birthday)) {
        discount = 20;
    } else if (amount >= 150 && (premium || orders >= 10)) {
        discount = 15;
    } else if (amount >= 100 && coupon) {
        discount = 10;
    } else {
        discount = 0;
    }

    double discountAmount = amount * discount / 100;
    double finalPrice = amount - discountAmount;

    System.out.println();
    System.out.println("Original price: $" + amount);
    System.out.println("Discount: " + discount + "%");
    System.out.println("Discount amount: $" + discountAmount);
    System.out.println("Final price: $" + finalPrice);

    if (discount == 0) {
        System.out.println("Sorry, no discount this time");
    } else {
        System.out.println("You got a discount!");
    }
}
}