package page6;

import java.util.Scanner;

public class page6_6 {
    // (6) Calculate and print the result of the expression b² - 4ac for given
    // values of a, b, and c.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = in.nextInt();
        System.out.println("Enter the second number: ");
        int b = in.nextInt();
        System.out.println("Enter the third number: ");
        int c = in.nextInt();
        in.close();

        int result = b * b - 4 * a * c;
        System.out.println("The result of b² - 4ac is: " + result);
    }
}