package homework.page_6;

import java.util.Scanner;

public class page_6_2 {
    // (2) Calculate and print the perimeter and area of a rectangle.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle: ");
        int length = in.nextInt();
        System.out.println("Enter the width of the rectangle: ");
        int width = in.nextInt();
        int perimeter = 2 * (length + width);
        int area = length * width;
        System.out.println("The perimeter of the rectangle is " + perimeter);
        System.out.println("The area of the rectangle is: " + area);
    }
}