package page19;

import java.util.Scanner;

public class page19_5 {
    /*
     * בבי"ס יש 18 כיתות
     * כתוב תכנית הקולטת את מספר התלמידים בכל אחת מ-18 הכיתות
     * ומחשבת ומדפיסה:
     * א) כמה תלמידים יש בסה"כ.
     * ב) בכמה כיתות יש יותר מ-30 תלמידים.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalStudents = 0;
        int classesWithMoreThan30Students = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter the number of students in class " + i + ": ");
            int numStudents = in.nextInt();
            totalStudents += numStudents;
            if (numStudents > 30) {
                classesWithMoreThan30Students++;
            }
        }
        in.close();

        System.out.println("Total number of students: " + totalStudents);
        System.out.println("Number of classes with more than 30 students: " + classesWithMoreThan30Students);
    }
}
