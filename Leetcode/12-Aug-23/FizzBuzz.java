import java.util.*;

public class FizzBuzz {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num;
            System.out.println("Enter the value of number");
            num = sc.nextInt();
            String answer[] = new String [num];
            System.out.println("Below are the Array Values");
            for (int i=1; i<=answer.length; i++) {
                if(i%3 == 0) {
                    //if divisible by three then print fizz
                    answer[i-1] ="Fizz";
                } else if (i%5 == 0) {
                    //else if divisible by five,then print buzz
                    answer[i-1]="Buzz";
                } else if (i%3 ==0 || i%5 == 0) {
                    /* if both conditions above are true ,then it will print fizzbuzz*/
                    answer[i-1]= "FizzBuzz";
                } else {
                    answer[i-1]= Integer.toString(i);
                }
            }
            for (int i=0; i<answer.length; i++) {
                System.out.print(answer[i]);
            }
        }
    }
}
