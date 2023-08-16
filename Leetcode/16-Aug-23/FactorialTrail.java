import java.util.*;

public class FactorialTrail {
    public static int trailZero(int n) 
    {
        int fives=0;
        for(int i=5;i<=n;i+=5)
        {
            int x=i;
            while(x>0 && x%5==0)
            {
                ++fives;
                x/=5;
            }
        }
        return fives;
    }
    
  public static void main(String args[])
    {      
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number");
            int number= sc.nextInt();
            System.out.println(trailZero(number));
        }
    }
}
