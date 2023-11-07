package homework.page_6;

import java.util.Scanner;

public class page_6_1 {
    // (1) Calculate and print the perimeter of a triangle.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first side of the triangle: ");
        int a = in.nextInt();
        System.out.println("Enter the second side of the triangle: ");
        int b = in.nextInt();
        System.out.println("Enter the third side of the triangle: ");
        int c = in.nextInt();
        int perimeter = a + b + c;
        System.out.println("The perimeter of the triangle is: " + perimeter);
    }
}