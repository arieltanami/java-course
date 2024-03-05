
package page39;

public class page39_1 {
    /*
     * כתוב תכנית שתקלוט 100 מספרים ותציב אותם במערך בגודל 100
     * התכנית תדפיס את המערך בשני אופנים:
     * א. מהאיבר הראשון עד האיבר האחרון
     * ב. מהאיבר האחרון עד האיבר הראשון
     */
    public static void main(String[] args) {
        int size = 100;
        int[] arr = new int[size];

        // Get form user the numbers
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
        }
        
        // (א) Print the array
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // (ב) Print the array in reverse
        for (int i = size-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
