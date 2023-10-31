package page_6;

import java.util.Scanner;

public class page_6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // (1) Calculate and print the perimeter of a triangle.
        System.out.println("Enter the first side of the triangle: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second side of the triangle: ");
        int b = scanner.nextInt();
        System.out.println("Enter the third side of the triangle: ");
        int c = scanner.nextInt();
        int perimeter = a + b + c;
        System.out.println("The perimeter of the triangle is " + perimeter);

        // (2) Calculate and print the perimeter and area of a rectangle.
        System.out.println("Enter the length of the rectangle: ");
        int length = scanner.nextInt();
        System.out.println("Enter the width of the rectangle: ");
        int width = scanner.nextInt();
        int rectanglePerimeter = 2 * (length + width);
        int area = length * width;
        System.out.println("The perimeter of the rectangle is " + rectanglePerimeter);
        System.out.println("The area of the rectangle is " + area);

        // (3) Calculate and print the total price for 10 notebooks and 2 folders.
        System.out.println("Enter the price of a notebook: ");
        int notebookPrice = scanner.nextInt();
        System.out.println("Enter the price of a folder: ");
        int folderPrice = scanner.nextInt();
        int numberOfNotebooks = 10;
        int numberOfFolders = 2;
        int totalPrice = numberOfNotebooks * notebookPrice + numberOfFolders * folderPrice;
        System.out.println("The total price for " + numberOfNotebooks + " notebooks and " + numberOfFolders
                + " folders is " + totalPrice);

        // (4) Calculate and print the total price for entrance to a pool for a given
        // number of adults and children.
        System.out.println("Enter the number of adults: ");
        int adult = scanner.nextInt();
        System.out.println("Enter the number of children: ");
        int child = scanner.nextInt();
        int adultPrice = 25;
        int childPrice = 15;
        int totalEntrancePrice = adult * adultPrice + child * childPrice;
        System.out.println("The total price for entrance is " + totalEntrancePrice);

        // (5) Calculate and print the change from a 200 bill after paying for
        // supermarket goods.
        System.out.println("Enter the amount to pay for supermarket goods (less than 200): ");
        int amount = scanner.nextInt();
        int change = 200 - amount;
        System.out.println("The change from a 200 bill is " + change);

        // (6) Calculate and print the result of the expression b² - 4ac for given
        // values of a, b, and c.
        System.out.println("Enter the first number: ");
        int numA = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int numB = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int numC = scanner.nextInt();
        int result = numB * numB - 4 * numA * numC;
        System.out.println("The result of b² - 4ac is " + result);
    }
}