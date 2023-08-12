import java.util.*;

class HappyNum
{  
     public static boolean isHappy(int n) 
     {
        
        Set<Integer> set = new HashSet<Integer>();
        int sum,digit;
        while (set.add(n)) 
        {
            sum = 0;
            while (n > 0) {
                digit = n%10;
                sum += digit*digit;
                n /= 10;
            }
            if (sum == 1)
                return true;
            else
                n = sum;
        }
        return false;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num;
            System.out.println("Enter the number");
            num= sc.nextInt();
            System.out.println(isHappy(num));
        }
    }
}

