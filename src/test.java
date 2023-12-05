import java.util.*;

public class test {
    public static void main(String[] args) {
        int i = 0,count=0;
        double hight = 10;
        Scanner in = new Scanner(System.in);
        hight = in.nextDouble();
        
        for (i=1; i<=5; i++)
        {
            System.out.println("Enter hight of student ");
            hight = in.nextDouble();
            if(hight>=1.9)
                count++; // count = count + 1;
        }
        
        System.out.println("There are " + hight + " hier that 1.90");
        // int count = 0;
        // double height = 1.9;
        // Scanner in = new Scanner(System.in).useLocale(Locale.US);

        // for (int i = 1; i <= 5; i++) {
        //     System.out.println("Enter height of student: ");
        //     height = in.nextDouble();
        //     if (height > 1.9) {
        //         count++;
        //     }
        // }
        // System.out.println("There are " + count + " students that are taller than 1.90.");
    }
}