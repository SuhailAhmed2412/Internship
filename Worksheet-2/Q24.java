import java.util.*;

public class Q24 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double length, width;
            double area, perimeter;
            System.out.println("Enter the length of the rectangle");
            length= input.nextDouble();
            System.out.println("Enter the width of the rectangle");
            width= input.nextDouble();
            area= length*width;
            perimeter= 2 * (length+width);
            System.out.println("Area of the rectangle is: "+area);
            System.out.println("Perimeter of the rectangle is: "+perimeter);
        }
    }    
}
