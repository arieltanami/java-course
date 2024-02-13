package page17;

import java.util.Scanner;

public class page17_4 {
    /*
     * בכתה 12 תלמידים. כתוב תכנית שקולטת ציון במחשבים של כל תלמיד
     * ומחשבת ומדפיסה:
     * א) כמה תלמידים עברו (בציון של 55 לפחות)
     * ב) כמה תלמידים נכשלו
     * ג) כמה תלמידים קבלו 90 ומעלה
     * ד) כמה תלמידים קבלו בין 65-75 (כולל)
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numStudents = 3;
        int passedCount = 0;
        int failedCount = 0;
        int excellentCount = 0;
        int mediumCount = 0;

        for (int i = 1; i <= numStudents; i++) {
            System.out.print("Enter the grade for student " + i + ": ");
            int grade = in.nextInt();

            if (grade >= 90) {
                excellentCount++;
            } else if (grade >= 65 && grade <= 75) {
                mediumCount++;
            }

            if (grade >= 55) {
                passedCount++;
            } else {
                failedCount++;
            }
        }
        in.close();

        System.out.println("Number of students who passed: " + passedCount);
        System.out.println("Number of students who failed: " + failedCount);
        System.out.println("Number of students who received 90 and above: " + excellentCount);
        System.out.println("Number of students who received between 65 and 75 (inclusive): " + mediumCount);
    }

}
