import java.util.*;

public class Q22 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int first, second, third, temp, largest;
            System.out.println("Enter the first number");
            first= input.nextInt();
            System.out.println("Enter the second number");
            second= input.nextInt();
            System.out.println("Enter the third number");
            third= input.nextInt();
            //using ternary operator
            temp =first>second?first:second;
            largest =third>temp?third:temp;
            System.out.println("The largest of the provided three numbers is: "+largest);
        }       
    }
}
