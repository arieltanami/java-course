package homework.page9;

import java.util.Scanner;

public class page9_5 {
    /**
     * בארגז קולה יש 6 בקבוקים של ליטר וחצי. כתוב תכנית שקולטת מספר הבקבוקים שצריך
     * להזמין למסיבה, ומחשבת ומדפיסה כמה ארגזים זה, וכמה בקבוקים נוספים
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num, argazim, bakbukim;
        num = argazim = bakbukim = 0;

        System.out.println("Enter the number of bottles needed for the party: ");
        num = in.nextInt();
        in.close();

        argazim = num / 6;
        bakbukim = num % 6;

        System.out.println("You need " + argazim + " boxes and " + bakbukim + " additional bottles.");
    }
}