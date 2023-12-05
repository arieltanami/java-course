package homework.page8;

import java.util.Scanner;

public class page8_2 {
    // (2) Calculate and print the value of a sum of money in Shekels, given the
    // exchange rate and the sum in Dollars.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the exchange rate from Dollar to Shekel: ");
        double exchangeRate = in.nextDouble();
        System.out.println("Enter the sum in Dollars: ");
        double sumInDollars = in.nextDouble();
        in.close();

        double sumInShekels = exchangeRate * sumInDollars;
        System.out.println("The sum in Shekels is " + sumInShekels);
    }
}