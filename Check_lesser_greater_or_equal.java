
// If a = b then return equal , if a > b then return a is greater , or if a < b then retun a is lesser
import java.util.*;

class Check_lesser_greater_or_equal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("both are equal");
        } else {
            if (a > b) {
                System.out.println("a is  greater");
            } else {
                System.out.println("a is lesser");
            }
        }
    }
}