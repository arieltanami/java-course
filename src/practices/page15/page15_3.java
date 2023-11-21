package practices.page15;

public class page15_3 {
    // (3) כתוב תכנית שמדפיסה את סדרת מספרים: 5, 10, 15, . . . , 50
    // (במקום להגדיל את i בכל שלב באחד, אפשר להגדילו ב5: i=i+5)
    public static void main(String[] args) {
        for (int i = 5; i <= 50; i += 5) {
            System.out.println(i);
        }
    }
}
