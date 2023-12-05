package homework.page11;

import java.util.Scanner;

public class page11_1 {
    /**
     * קלוט מספר 1-3
     * אם המספר הוא 1: קלוט 3 מספרים נוספים והדפס את סכומם
     * אם המספר הוא 2: קלוט 2 מספרים נוספים והדפס את מכפלתם
     * אם המספר הוא 3: קלוט 4 מספרים נוספים והדפס את ממוצעם
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c, d;
        a = b = c = d = 0;

        System.out.println("Enter a number (1-3): ");
        int num = in.nextInt();

        if (num == 1) {
            System.out.println("Enter three numbers: ");
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            System.out.println("The sum is " + (a + b + c));
        } else if (num == 2) {
            System.out.println("Enter two numbers: ");
            a = in.nextInt();
            b = in.nextInt();
            System.out.println("The product is " + (a * b));
        } else if (num == 3) {
            System.out.println("Enter four numbers: ");
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            d = in.nextInt();
            System.out.println("The average is " + ((a + b + c + d) / 4.0));
        }
        in.close();
    }
}