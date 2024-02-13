package page9;

import java.util.Scanner;

public class page9_3 {
    /**
     * (3) כתוב תכנית שקולטת מספר בן 4 ספרות. התכנית תדפיס את סכום זוג הספרות
     * הימניות
     * וזוג הספרות השמאליות.
     * לדוגמא: אם נקלט המספר 1247, יודפס הסכום 47 + 12, כלומר 59.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num, meot, ahadot;
        num = meot = ahadot = 0;

        System.out.println("Enter a four-digit number: ");
        num = in.nextInt();
        in.close();

        meot = num % 100;
        ahadot = num / 100;

        System.out.println("The sum is " + (meot + ahadot));
    }
}