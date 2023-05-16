import java.util.*;

public class SumofNatural {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int numRange, sum=0;
            System.out.println("Enter the range of Natural Numbers");
            numRange= input.nextInt();
            if(numRange == 0) {
                System.out.println("Enter the correct range again");
                main(args);
            }
            else if (numRange >= 1) {
                for(int i=1; i<=numRange; i++) {
                    sum = sum + i;
                }
                System.out.println("The Sum of Number Range given is: "+sum);
            }
        }
    }
}
