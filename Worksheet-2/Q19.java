import java.util.*;

public class Q19 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int num1, num2, temp;
            System.out.println("Enter the value of number 1");
            num1= input.nextInt();
            System.out.println("Enter the value of number 2");
            num2= input.nextInt();
            System.out.println("Values before swapping: Number1:"+num1+" Number2: "+num2);
            temp= num1;
            num1= num2;
            num2= temp;
            System.out.println("Values after swapping: Number1:"+num1+" Number2: "+num2);
        }
    }
}
