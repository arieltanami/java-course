package page38;

import java.util.Scanner;

/**
 * כתוב תכנית שקולטת 10 מספרים ומדפיסה אותם לפי סדר הפוך
 */
public class page38_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            int size = 10, i = 0;
            int[] arr = new int[size];

            for (i = 0; i < size; i++) {
                System.out.print("Enter the " + (i + 1) + " number: ");
                arr[i] = in.nextInt();
            }

            for (i = size-1; i >= 0; i--) {
                System.out.print(arr[i] +" ");
            }
        } finally {
            in.close();
        }

    }
}