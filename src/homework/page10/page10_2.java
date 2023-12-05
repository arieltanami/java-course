package homework.page10;

import java.util.Scanner;

public class page10_2 {
    /**
     * (2) כתוב תכנית שקולטת מספר תלת-ספרתי
     * ומדפיסה האם ספרת המאות קטנה מספרת האחדות, או לא
     * דוגמא לקלט: 293 הפלט: כן
     * דוגמא לקלט: 501 הפלט: לא
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a three-digit number: ");
        int num = in.nextInt();
        in.close();

        int meot = num / 100;
        int ahadot = num % 10;

        if (meot < ahadot) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}