package page38;

import java.util.Scanner;

/**
 * כתוב תכנית שקולטת ציון במחשבים של 20 תלמידים בכתה
 * ומחשבת ומדפיסה את הממוצע הכיתתי, וכמה תלמידים קבלו מעל הממוצע הכיתתי
 */
public class page38_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = 20;
        int[] scores = new int[size];
        int sum = 0;
        int countAboveAverage = 0;

        System.out.println("Enter the scores of " + size + " students: ");
        for (int i = 0; i < size; i++) {
            scores[i] = in.nextInt();
            sum += scores[i];
        }

        double average = (double) sum / size;

        for (int score : scores) {
            if (score > average) {
                countAboveAverage++;
            }
        }

        System.out.println("The class average is " + average);
        System.out.println(countAboveAverage + " students scored above the class average.");

        in.close();
    }
}