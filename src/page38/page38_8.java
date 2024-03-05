package page38;

import java.util.Scanner;

/**
 * כתוב תכנית שקולטת מערך באורך 10, ומסובבת כל איבר מקום אחד
 * ימינה כך שהאיבר העשירי יכנס למקום הראשון
 * דוגמא למערך הקלט: 1 2 3 4 5 6 7 8 9 10
 * מערך הפלט: 10 1 2 3 4 5 6 7 8 9
 */
public class page38_8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = 10;
        int[] arr = new int[size];

        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++)
            arr[i] = in.nextInt();

        // Swap
        for (int i = size - 1; i > 0; i--)
            swap(arr, (i + 1) % 10, i);

        // Print
        for (int num : arr)
            System.out.print(num + " ");

        in.close();
    }

    // swap elements in an array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}