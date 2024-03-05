package page38;

import java.util.Scanner;

/**
 * 10 כתוב תכנית שקולטת מספר ומציבה אותו במקום הראשון במערך באורך
 * ובשאר מקומות המערך מציבה כל פעם את המספר העוקב של המקום הקודם
 * הדפס את המערך בשורה אחת
 * דוגמא:
 * קלט: 17.
 * פלט:17 18 19 20 . . . 26
 * 
 * A program that reads a number and assigns it to the first place in an array of length 10
 * and in the rest of the places in the array assigns each time the next number of the previous place
 * Print the array in one line
 * 
 * .
 * 
 */
public class page38_7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = 10;
        int[] arr = new int[size];

        System.out.println("Enter a number: ");
        arr[0] = in.nextInt();

        for (int i = 1; i < size; i++)
            arr[i] = arr[i - 1] + 1;

        for (int num : arr)
            System.out.print(num + " ");

        in.close();
    }
}