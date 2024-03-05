
package page39;

public class page39_2 {
    /*
     * בגודל 99, המכיל מספרים שלמים וחיוביים a נתון מערך חד-ממדי
     * a א. כתוב קטע להצגת כל המספרים הזוגיים במערך
     * החל מהמקום העשירי במערך a ב. כתוב קטע להצגת הנמצאים במקומות הזוגיים במערך
     * ג. כתוב קטע להצגת סכום כל המספרים במערך המתחלקים ב-3 בלי שארית
     * 
     * Given a one-dimensional array of 99 positive integers a. (a) Write a snippet
     * to display all the even numbers in the array starting from the 10th element
     * (b) Write a snippet to display the numbers in the even places in the array
     * (c) Write a snippet to display the sum of all numbers in the array that are
     * divisible by 3
     * 
     */
    public static void main(String[] args) {
        int size = 100;
        int[] arr = new int[size];

        // Fill the array
        for (int i = 0; i < size; i++)
            arr[i] = i + 1;
        System.out.println();

        // (א) Print all odd numbers
        for (int i = 1; i < size; i += 2)
            System.out.print(arr[i] + " ");
        System.out.println();

        // (ב) Print all even numbers starting from the 10th element
        for (int i = 9; i < size; i += 2)
            System.out.print(arr[i] + " ");
        System.out.println();

        // (ג) Print the sum of all numbers in the array that are divisible by 3
        int sum = 0;
        for (int i = 0; i < size; i++)
            if (arr[i] % 3 == 0) {
                sum += arr[i];
            }
        System.out.println(sum);
    }
}
