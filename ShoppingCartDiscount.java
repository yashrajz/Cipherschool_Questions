import java.util.*;

public class ShoppingCartDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total cart amount: ₹");
        double totalAmount = scanner.nextDouble();

        double discount = 0;
        double finalAmount = totalAmount;

        if (totalAmount > 5000) {
            discount = totalAmount * 0.20;
        } else if (totalAmount >= 3000) {
            discount = totalAmount * 0.10;
        }

        finalAmount -= discount;

        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Amount: ₹" + finalAmount);
        
        scanner.close();
    }
}
