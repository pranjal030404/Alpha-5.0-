import java.util.*;

class Find_even_odd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("No. is even");
        } else {
            System.out.println("No. is odd");
        }
    }
}