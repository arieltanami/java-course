package homework.page6;

import java.util.Scanner;

public class page6_3 {
    // (3) Calculate and print the total price for 10 notebooks and 2 folders.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberOfNotebooks = 10;
        int numberOfFolders = 2;

        System.out.println("Enter the price of a notebook: ");
        int notebookPrice = in.nextInt();
        System.out.println("Enter the price of a folder: ");
        int folderPrice = in.nextInt();
        in.close();

        int totalPrice = numberOfNotebooks * notebookPrice + numberOfFolders * folderPrice;
        System.out.println("The total price for " + numberOfNotebooks + " notebooks and " + numberOfFolders
                + " folders is: " + totalPrice);
    }
}