package lessons.page_8;

import java.util.Scanner;

public class page_8_1 {
  // (1) Calculate and print the average of a student's grades in three exams.
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the first exam grade: ");
    int grade1 = in.nextInt();
    System.out.println("Enter the second exam grade: ");
    int grade2 = in.nextInt();
    System.out.println("Enter the third exam grade: ");
    int grade3 = in.nextInt();

    int average = (grade1 + grade2 + grade3) / 3;
    System.out.println("The average grade is " + average);
  }
}
