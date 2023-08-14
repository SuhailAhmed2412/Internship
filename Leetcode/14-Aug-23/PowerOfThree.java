import java.util.Scanner;

public class PowerOfThree {
    static boolean checkPower(int num) {
        int temp = 3;
        while (temp < num) {
            temp *= 3;
        }
        
        while (temp > 0) {
            if (num >= temp) {
                num -= temp;
            }
            temp = temp/3;
        }
        
        return num == 0;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int num;
            System.out.println("Enter the number");
            num= sc.nextInt();
            System.out.println(checkPower(num));
        }
    }
}
