import java.util.*;
public class Q23 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int principal, tenure;
            double simpleInterst, interest=2.14;
            System.out.println("Enter the principal amout: ");
            principal= input.nextInt();
            System.out.println("Enter the tenure in years");
            tenure= input.nextInt();
            simpleInterst= (principal*tenure*interest) / 100;
            System.out.println("The Simple Interest is: "+simpleInterst);
        }
    }
}
