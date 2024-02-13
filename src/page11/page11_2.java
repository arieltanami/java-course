package page11;

import java.util.Scanner;

public class page11_2 {
    /**
     * קלוט מספר (1,2)
     * 
     * אם המספר הוא 1
     * קלוט טמפרטורה במעלות צלזיוס, וחשב והדפס את
     * הטמפרטורה במעלות פארנהייט עפ"י הנוסחא
     * f=1.8 * c +32;
     * 
     * אם המספר הוא 2
     * קלוט טמפרטורה במעלות פארנהייט, וחשב והדפס את
     * הטמפרטורה במעלות צלזיוס עפ"י הנוסחא
     * c= (f-32)*5/9;
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double c, f;
        c = f = 0;

        System.out.println("Enter a number (1 or 2): ");
        int num = in.nextInt();

        if (num == 1) {
            System.out.println("Enter temperature in Celsius: ");
            c = in.nextDouble();
            f = 1.8 * c + 32;
            System.out.println("The temperature in Fahrenheit is " + f);
        } else if (num == 2) {
            System.out.println("Enter temperature in Fahrenheit: ");
            f = in.nextDouble();
            c = (f - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is " + c);
        }
        in.close();
    }
}