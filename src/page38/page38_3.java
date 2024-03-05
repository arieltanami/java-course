package page38;

import java.util.Scanner;

/**
 * כתוב תכנית שקולטת 25 מספרים ומדפיסה כמה מהם שווים למספר האחרון
 */
public class page38_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = 3, i = 0;
        int[] nums = new int[size];
        int count = 0;

        try { // for closing the scanner
            for (i = 0; i < size; i++) {
                System.out.print("Enter the " + (i + 1) + " number: ");
                nums[i] = in.nextInt();
            }

            for (i = 0; i < size; i++)
                if (nums[i] == nums[size - 1])
                    count++;
            System.out.println("The number of numbers that are equal to the last number is: " + --count);
        } finally {
            in.close();
        }

    }
}