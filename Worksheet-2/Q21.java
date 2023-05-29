import java.util.*;

public class Q21 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int number, prod;
            System.out.println("Enter the number to find the table for:");
            number= input.nextInt();
            if(number==0) {
                System.out.println("Please enter a valid number");
                main(args);
            }
            else {
                System.out.println("The table for "+number+" is:");
                for(int i=1; i<=10; i++) {
                    prod= number * i;
                    System.out.println(number+"*"+i+"= "+prod);
                }
            }
        }        
    }
}
