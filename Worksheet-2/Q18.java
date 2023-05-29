import java.util.*;

public class Q18 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double num1, num2; //declaring as double in order to get the decimal value for average
            double avg;
            System.out.println("Enter the value of number 1");
            num1= input.nextInt();
            System.out.println("Enter the value of number 2");
            num2= input.nextInt();
            avg= (num1+num2)/2;
            System.out.println("Average of provided two numbers: "+avg);
        }        
    }
}
