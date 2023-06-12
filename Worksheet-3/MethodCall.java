import java.util.*;
class Addition {
    int sum=0;
    public int addTwoint(int a, int b) {
        sum = a + b;
        return sum;
    }
}

public class MethodCall {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int a, b;
            int sum;
            System.out.println("Enter the value of a");
            a= input.nextInt();
            System.out.println("Enter the value of b");
            b= input.nextInt();
            Addition obj = new Addition();
            sum = obj.addTwoint(a, b);
            System.out.println("The sum of provided two integers is: "+sum);
        }       
    }    
}
