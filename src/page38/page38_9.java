package page38;

import java.util.Scanner;

/**
 * כתוב תכנית שקולטת מערך באורך 10, ומסובבת כל איבר מקום אחד
 * שמאלה כך שהאיבר הראשון יכנס למקום העשירי
 * דוגמא למערך הקלט: 1 2 3 4 5 6 7 8 9 10
 * מערך הפלט: 2 3 4 5 6 7 8 9 10 1
 */
public class page38_9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = 10;
        int[] arr = new int[size];

        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++)
            arr[i] = in.nextInt();

        // Swap
        for (int i = 0; i < size-1; i++)
            swap(arr, i, (i + 9) % 10);

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