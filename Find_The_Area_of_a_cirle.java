import java.util.*;

class Find_The_Area_of_a_cirle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the radius of the circle: ");
        float a = sc.nextFloat();
        float area = a * 3.14f;
        System.out.println("The area of a circle whose radius is " + a + "and area is " + area);
    }
}