import java.util.*;

class Checking_a_person_is_adult_or_not {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the person: ");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Person is Adult now");
        } else {
            System.out.println("Person is not adult");
        }
    }
}