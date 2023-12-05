package homework.page6;

import java.util.Scanner;

public class page6_4 {
    // (4) Calculate and print the total price for entrance to a pool for a given
    // number of adults and children.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int adultPrice = 25;
        int childPrice = 15;

        System.out.println("Enter the number of adults: ");
        int adult = in.nextInt();
        System.out.println("Enter the number of children: ");
        int child = in.nextInt();
        in.close();

        int totalEntrancePrice = adult * adultPrice + child * childPrice;
        System.out.println("The total price for entrance is: " + totalEntrancePrice);
    }
}