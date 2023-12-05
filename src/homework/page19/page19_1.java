package homework.page19;

import java.util.Scanner;

public class page19_1 {
    /*
     * כתוב תכנית שקולטת 30 מספרים שלמים, ולגבי כל מספר מדפיסה 'זוגי' או 'איזוגי'
     * בהתאם לסוג המספר
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int max = 30;

        for (int i = 0; i < max; i++) {
            System.out.print("Enter a number: ");
            if (in.nextInt() % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
        in.close();
    }
}