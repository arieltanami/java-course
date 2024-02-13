package page6;

import java.util.Scanner;

public class page6_7 {
    // (7) Calculate and print the product of two numbers, then increase the first
    // number by 3, decrease the second number by 1, and calculate and print the new
    // product.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int x = in.nextInt();
        System.out.println("Enter the second number: ");
        int y = in.nextInt();
        in.close();

        int product = x * y;
        System.out.println("The product of the numbers is " + product);

        x += 3;
        y -= 1;
        product = x * y;
        System.out.println(
                "After increasing the first number by 3 and decreasing the second number by 1, the product is: "
                        + product);
    }
}