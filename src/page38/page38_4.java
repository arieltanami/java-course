package page38;

/**
 * כתוב תכנית שמאחסנת מספרים אקראיים בתחום 1-100 במערך באורך 20
 * א. ומחשבת ומדפיסה את סכום המספרים במקומות האיזוגיים במערך
 * ב. ומחשבת ומדפיסה את סכום המספרים במקומות הזוגיים במערך
 * ג. ומחשבת ומדפיסה כמה מספרים איזוגיים וכמה זוגיים יש במערך
 */

public class page38_4 {
    public static void main(String[] args) {
        int size = 3;
        int min = 1, max = 100, range = (max - min + 1);
        int[] nums = new int[size];

        int sumEven = 0;
        int sumOdd = 0;
        int countEven = 0;
        int countOdd = 0;

        // Fill the array with random numbers between 1 and 100
        for (int i = 0; i < size; i++) {
            nums[i] = min + (int) (Math.random() * range);
        }

        // Print the array
        for (int i = 0; i < size; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        // Calculate the sum of numbers at even and odd positions
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                sumEven += nums[i];
                countEven++;
            } else {
                sumOdd += nums[i];
                countOdd++;
            }
        }

        System.out.println("Sum of numbers at even positions: " + sumEven);
        System.out.println("Sum of numbers at odd positions: " + sumOdd);
        System.out.println("Count of even numbers: " + countEven);
        System.out.println("Count of odd numbers: " + countOdd);
    }
}