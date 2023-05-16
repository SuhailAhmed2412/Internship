import java.util.*;

public class PallindromeNumber {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int number, remainder, sum=0, temp;
            System.out.println("Enter the number to be checked");
            number= input.nextInt();
            temp=number;    
            while(number>0){    
                remainder=number%10;  //getting remainder  
                sum=(sum*10)+remainder;    
                number=number/10;    
            }    
            if(temp==sum)    
                System.out.println(number+" is a Palindrome Number");    
            else    
                System.out.println(number+" is not a Palindrome Number");
        }        
    }
}
