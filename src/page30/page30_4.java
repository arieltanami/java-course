package page30;

import java.util.Scanner;

/**
 * בכניסה לבריכה רושמים את מספרי המנוי של הנכנסים
 * כתוב תכנית הקולטת את הנתונים שנרשמו בכניסה לבריכה ביום מסוים,
 * ומדפיסה את מספרי המנוי הגדולים מ-1000
 * 
 * לא ידוע כמה מנויים נכנסו, אך בסוף הקלט יופיע מספר שלילי
 */
public class page30_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int subscriptionNumber;

        System.out.println(
                "Enter the subscription numbers of those entering the pool.\nEnter a negative number to stop: ");

        do {
            subscriptionNumber = in.nextInt();
            if (subscriptionNumber > 1000) {
                System.out.println("-" + subscriptionNumber);
            }
        } while (subscriptionNumber >= 0);

        in.close();
    }
}