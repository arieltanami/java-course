package page19;

public class page19_4 {
    // כתוב תכנית שמדפיסה את סכום כל המספרים האיזוגיים בין 30-1
    public static void main(String[] args) {
        int max = 30, count = 0;

        for (int i = 1; i <= max; i++)
            if (i % 2 != 0) {
                count += i;
            }

        System.out.println("Sum of all even numbers between 30-1: " + count);
    }
}
