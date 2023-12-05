package homework.page6;

import java.util.Scanner;

public class page6_5 {
    // (5) Calculate and print the change from a 200 bill after paying for
    // supermarket goods.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the amount to pay for supermarket goods (less than 200): ");
        int amount = in.nextInt();
        in.close();

        int change = 200 - amount;
        System.out.println("The change from a 200 bill is: " + change);
    }
}