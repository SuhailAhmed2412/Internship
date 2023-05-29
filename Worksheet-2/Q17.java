import java.util.*;

public class Q17 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int number;
            System.out.println("Enter the number to be validated");
            number= input.nextInt();
            if(number % 2 == 0) {
                System.out.println("Give number is even");
            }
            else {
                System.out.println("Given number is odd");
            }
        }        
    }
}
