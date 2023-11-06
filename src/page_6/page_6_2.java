package page_6;

import java.util.Scanner;

public class page_6_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // (1) Calculate and print the perimeter of a triangle.
        System.out.println("Enter the first side of the triangle: ");
        int a = in.nextInt();
        System.out.println("Enter the second side of the triangle: ");
        int b = in.nextInt();
        System.out.println("Enter the third side of the triangle: ");
        int c = in.nextInt();
        int perimeter = a + b + c;
        System.out.println("The perimeter of the triangle is: " + perimeter);

        // (2) Calculate and print the perimeter and area of a rectangle.
        System.out.println("Enter the length of the rectangle: ");
        int length = in.nextInt();
        System.out.println("Enter the width of the rectangle: ");
        int width = in.nextInt();
        int rectanglePerimeter = 2 * (length + width);
        int area = length * width;
        System.out.println("The perimeter of the rectangle is " + rectanglePerimeter);
        System.out.println("The area of the rectangle is: " + area);

        // (3) Calculate and print the total price for 10 notebooks and 2 folders.
        System.out.println("Enter the price of a notebook: ");
        int notebookPrice = in.nextInt();
        System.out.println("Enter the price of a folder: ");
        int folderPrice = in.nextInt();
        int numberOfNotebooks = 10;
        int numberOfFolders = 2;
        int totalPrice = numberOfNotebooks * notebookPrice + numberOfFolders * folderPrice;
        System.out.println("The total price for " + numberOfNotebooks + " notebooks and " + numberOfFolders
                + " folders is " + totalPrice);

        // (4) Calculate and print the total price for entrance to a pool for a given
        // number of adults and children.
        System.out.println("Enter the number of adults: ");
        int adult = in.nextInt();
        System.out.println("Enter the number of children: ");
        int child = in.nextInt();
        int adultPrice = 25;
        int childPrice = 15;
        int totalEntrancePrice = adult * adultPrice + child * childPrice;
        System.out.println("The total price for entrance is: " + totalEntrancePrice);

        // (5) Calculate and print the change from a 200 bill after paying for
        // supermarket goods.
        System.out.println("Enter the amount to pay for supermarket goods (less than 200): ");
        int amount = in.nextInt();
        int change = 200 - amount;
        System.out.println("The change from a 200 bill is: " + change);

        // (6) Calculate and print the result of the expression b² - 4ac for given
        // values of a, b, and c.
        System.out.println("Enter the first number: ");
        int numA = in.nextInt();
        System.out.println("Enter the second number: ");
        int numB = in.nextInt();
        System.out.println("Enter the third number: ");
        int numC = in.nextInt();
        int result = numB * numB - 4 * numA * numC;
        System.out.println("The result of b² - 4ac is: " + result);

        // (7) Calculate and print the product of two numbers, then increase the first
        // number by 3, decrease the second number by 1, and calculate and print the new
        // product.
        System.out.println("Enter the first number: ");
        int numX = in.nextInt();
        System.out.println("Enter the second number: ");
        int numY = in.nextInt();
        int product = numX * numY;
        System.out.println("The product of the numbers is " + product);
        numX += 3;
        numY -= 1;
        product = numX * numY;
        System.out.println("After increasing the first number by 3 and decreasing the second number by 1, the product is: " + product);
    }
}