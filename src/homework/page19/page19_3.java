package homework.page19;

public class page19_3 {
    // כתוב תכנית שמדפיסה את כל המספרים האיזוגיים בין 30-1
    public static void main(String[] args) {
        int max = 30;

        for (int i = 1; i <= max; i++)
            System.out.print(i % 2 != 0 ? i : " ");

        System.out.println();
    }
}
