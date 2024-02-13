package page30;

import java.util.Scanner;

/**
 * לצורך רישום תלמידים לחוג אמנות במתנ"ס, קולטים שם כל תלמיד
 * כתוב תכנית שתקלוט שמות התלמידים, תספור אותם ותדפיס את מספר הנרשמים
 * סיום הרישום יהיה כאשר ייקלט השם
 * "noname"
 */
public class page30_5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        String name;

        System.out.println("Enter the names of the students\nEnter 'noname' to stop: ");

        do {
            name = in.nextLine();
            if (!name.equals("noname")) {
                count++;
            }
        } while (!name.equals("noname"));

        System.out.println("Number of students registered: " + count);

        in.close();
    }
}