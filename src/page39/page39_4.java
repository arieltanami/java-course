
package page39;

public class page39_4 {
    /*
     * נתון מערך חד-ממדי בגודל 80 המכיל מספרים. כתוב תכנית שתחשב ותדפיס את סכום כל
     * האיברים במחצית הראשונה של המערך ואת סכום כל האיברים במחצית השניה של המערך
     * בסוף התכנית תבדוק איזה סכום גדול יותר, ותדפיס הודעה מתאימה
     */
    public static void main(String[] args) {
        int size = 80;
        int[] arr = new int[size];
        int sum1 = 0, sum2 = 0;

        // Fill the array with random numbers
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        // Calculate the sum of the first half and the second half
        for (int i = 0; i < arr.length / 2; i++) {
            sum1 += arr[i];
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            sum2 += arr[i];
        }

        // Print the sums using switch case
        switch (sum1 > sum2 ? 1 : sum1 < sum2 ? 2 : 0) {
            case 1:
                System.out.println("The sum of the first half is bigger than the sum of the second half");
                break;
            case 2:
                System.out.println("The sum of the second half is bigger than the sum of the first half");
                break;
            default:
                System.out.println("The sum of the first half is equal to the sum of the second half");
                break;
        }
    }
}
