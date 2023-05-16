import java.util.*;

public class PrimeorNot {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int number, flag=0;
            System.out.println("Enter the number to be checked");
            number = input.nextInt();
            if(number == 0) {
                System.out.println("Please enter correct number");
                main(args);
            }
            else {
                for(int i=1; i<= number/2; i++) {
                    if(number % i ==0){
                        flag++;
                    }
                }
            }
            if(flag > 1) {
                System.out.println(number+" is not a Prime Number");
            }
            else {
                System.out.println(number+" is a Prime Number");
            }
        }
    }
}
