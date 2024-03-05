
package page39;

import java.util.Scanner;

public class page39_5 {
    /*
     * כתוב תכנית שתקלוט מספרים בין 25 ל- 90 למערך חד-ממדי בגודל 100
     * התכנית תקלוט מספר נוסף קטן מ-90 ותדפיס את כל איברי המערך הגדולים ממנו
     * 
     * Very Short Summary: 
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = 10;
        int[] arr = new int[size];
        int num = 0;

        // Get form user numbers between 25 to 90
        for (int i = 0; i < size; i++) {
            System.out.println("Enter a number between 25 to 90" + " (" + (i + 1) + "/" + size + "):");
            int input = in.nextInt();
            if (input >= 25 && input <= 90) {
                arr[i] = input;
            } else {
                System.out.println("Invalid input, try again");
                i--;
            }
        }

        // Get form user a number smaller than 90
        System.out.println("Enter a number smaller than 90:");
        num = in.nextInt();
        while (num >= 90) {
            System.out.println("Invalid input, try again");
            num = in.nextInt();
        }
        in.close();

        // Print all the numbers in the array that are bigger than the input number
        for (int i = 0; i < size; i++) {
            if (arr[i] > num) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
