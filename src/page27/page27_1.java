package page27;

import java.util.Scanner;

public class page27_1 {
    /*
     * כתוב תכנית המגרילה זוגות של מספרים
     * a, b
     * בין 1-10 , ומדפיסה את מכפלתם
     * (א) כל עוד המכפלה קטנה מ-80
     * (ב) כל עוד שני המספרים שהוגרלו a, b שונים זה מזה
     * (ג) חזור על שני החלקים כאשר זוג המספרים a, b נקלט ולא מוגרל
     * (ד) כמו (ג) אבל במקום חישוב מכפלה, חישוב a2 - b2
     */
    public static void main(String[] args) {
        int a = 0, b = 0;
        int min = 1, max = 10, range = (max - min + 1);
        int product = 0;

        System.out.println("~~~~~~~~~~ ~~~~~   ~~~~~ ~~~~~~~~~~");
        System.out.println("                 א");
        System.out.println("~~~~~~~~~~ ~~~~~   ~~~~~ ~~~~~~~~~~");
        while (product < 80) {
            a = min + (int) (Math.random() * range);
            b = min + (int) (Math.random() * range);
            product = a * b;
            System.out.println(a + " * " + b + " = " + product);
        }

        System.out.println("~~~~~~~~~~ ~~~~~   ~~~~~ ~~~~~~~~~~");
        System.out.println("                 ב");
        System.out.println("~~~~~~~~~~ ~~~~~   ~~~~~ ~~~~~~~~~~");
        do {
            a = min + (int) (Math.random() * range);
            b = min + (int) (Math.random() * range);
            product = a * b;

            System.out.println(a + " * " + b + " = " + product);
        } while (a != b);

        System.out.println("~~~~~~~~~~ ~~~~       ~~~ ~~~~~~~~~~");
        System.out.println("                (א) ג");
        System.out.println("~~~~~~~~~~ ~~~~       ~~~ ~~~~~~~~~~");
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Enter the value of a: ");
            a = in.nextInt();
            System.out.print("Enter the value of b: ");
            b = in.nextInt();
            product = a * b;

            System.out.println(a + " * " + b + " = " + product);
        } while (a != b);

        System.out.println("~~~~~~~~~~ ~~~~       ~~~ ~~~~~~~~~~");
        System.out.println("                (ב) ג");
        System.out.println("~~~~~~~~~~ ~~~~       ~~~ ~~~~~~~~~~");

        do {
            System.out.print("Enter the value of a: ");
            a = in.nextInt();
            System.out.print("Enter the value of b: ");
            b = in.nextInt();
            product = a * b;

            System.out.println(a + " * " + b + " = " + product);
        } while (product < 80);

        System.out.println("~~~~~~~~~~ ~~~~       ~~~ ~~~~~~~~~~");
        System.out.println("                (א) ד");
        System.out.println("~~~~~~~~~~ ~~~~       ~~~ ~~~~~~~~~~");
        
        do {
            System.out.print("Enter the value of a: ");
            a = in.nextInt();
            System.out.print("Enter the value of b: ");
            b = in.nextInt();
            product = (a*a)-(b*b);

            System.out.println(a + "^2 - " + b + "^2 = " + product);
        } while (product<80);

        System.out.println("~~~~~~~~~~ ~~~~       ~~~ ~~~~~~~~~~");
        System.out.println("                (ב) ד");
        System.out.println("~~~~~~~~~~ ~~~~       ~~~ ~~~~~~~~~~");

        do {
            System.out.print("Enter the value of a: ");
            a = in.nextInt();
            System.out.print("Enter the value of b: ");
            b = in.nextInt();
            product = (a*a)-(b*b);

            System.out.println(a + "^2 - " + b + "^2 = " + product);
        } while (a != b);

        in.close();
    }
}