package page19;

import java.util.Scanner;

public class page19_6 {
    /*
     * 100 
     * מתומכיו של מועמד לראשות הממשלה תרמו כסף עבור מערכת הבחירות
     * כתוב תכנית שקולטת את 100 התרומות ומחשבת ומדפיסה:
     * א) כמה מהתומכים תרמו יותר מ-2500 ש"ח.
     * ב) מה הסכום שנתרם.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalDonors = 3;
        int donorsAbove2500 = 0;
        int totalDonation = 0;

        for (int i = 1; i <= totalDonors; i++) {
            System.out.print("Enter donation amount for donor " + i + ": ");
            int donation = in.nextInt();
            totalDonation += donation;
            if (donation > 2500) {
                donorsAbove2500++;
            }
        }

        System.out.println("Number of donors who donated more than 2500 NIS: " + donorsAbove2500);
        System.out.println("Total donation amount: " + totalDonation + " NIS");

        in.close();
    }
}
