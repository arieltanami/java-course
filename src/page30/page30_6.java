package page30;

import java.util.Scanner;

/**
 * האגף לפיקוח עירוני אוספת נתונים על דוחות חנייה
 * כתוב תכנית שתקלוט עבור כל מכונית שקבלה דוח את מספר המכונית
 * התכנית תספור ותדפיס כמה מכוניות קיבלו דוח חנייה
 * הקלט יסתיים כאשר ייקלט מספר מכונית אפס
 */
public class page30_6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int carNumber = 0;

        System.out.println("Enter the number of each car that received a parking report\nEnter '0' to stop: ");

        do {
            carNumber = in.nextInt();
            if (carNumber != 0) {
                count++;
            }
        } while (carNumber != 0);

        System.out.println("Number of cars that received a parking report: " + count);

        in.close();
    }
}