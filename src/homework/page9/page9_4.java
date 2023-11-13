package homework.page9;

import java.util.Scanner;

public class page9_4 {
    /**
     * (3) כתוב תכנית שקולטת מספר ימים בספירת העומר (מספר בין 1-49), ומדפיסה כמה
     * שבועות
     * זה בעומר, וכמה ימים זה בעומר. דוגמא: קלט 33 הפלט יהיה 4 שבועות, 5 ימים.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num, shavuot, yamim;
        num = shavuot = yamim = 0;

        System.out.println("Enter a number of days in the Sfirat HaOmer (1-49): ");
        num = in.nextInt();

        shavuot = num / 7;
        yamim = num % 7;

        System.out.println(shavuot + " weeks, " + yamim + " days.");
    }
}