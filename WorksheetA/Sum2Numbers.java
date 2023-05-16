import java.util.*;
public class Sum2Numbers {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int num1, num2, sum;
            System.out.print("Enter the first number : ");
            num1= input.nextInt();
            System.out.println("Enter the secnod number :");
            num2= input.nextInt();
            sum= num1+num2;
            System.out.println("The Sum of "+num1+" and "+num2+" is: "+sum);
        }
    }
}   