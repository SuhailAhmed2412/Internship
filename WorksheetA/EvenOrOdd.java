import java.util.*;

public class EvenOrOdd {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int num;
            System.out.println("Enter the number to be checked: ");
            num= input.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " is an even number.");
            } else {
                System.out.println(num + " is an odd number.");
            }
        }
    }
}