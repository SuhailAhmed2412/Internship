import java.util.*;

public class Q20 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int number, flag=0;
            System.out.println("Enter the numebr to be validated");
            number= input.nextInt();
            if(number==0 || number==1) {
                System.out.println("The given number is not a prime number");
            }
            else {
                for(int i=2; i< number; i++) {
                    if(number % i ==0) {
                        flag=1;
                    }
                }
                if(flag==0) {
                    System.out.println("The given number is a prime number");
                }
                else {
                    System.out.println("The given number is not a prime number");
                }
            }
        }
    }
}
