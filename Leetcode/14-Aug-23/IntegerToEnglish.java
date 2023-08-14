import java.util.*;

class IntegerToEnglish {
  public static String numberToWords(int num) {
    return num == 0 ? "Zero" : helper(num);
  }

  final static String[] belowTwenty = {"",        "One",     "Two",       "Three",    "Four",
                                        "Five",    "Six",     "Seven",     "Eight",    "Nine",
                                        "Ten",     "Eleven",  "Twelve",    "Thirteen", "Fourteen",
                                        "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
  final static String[] tens = {"",      "",      "Twenty",  "Thirty", "Forty",
                                 "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

  private static String helper(int num) {
    StringBuilder s = new StringBuilder();

    if (num < 20)
      s.append(belowTwenty[num]);
    else if (num < 100)
      s.append(tens[num / 10]).append(" ").append(belowTwenty[num % 10]);
    else if (num < 1000)
      s.append(helper(num / 100)).append(" Hundred ").append(helper(num % 100));
    else if (num < 1000000)
      s.append(helper(num / 1000)).append(" Thousand ").append(helper(num % 1000));
    else if (num < 1000000000)
      s.append(helper(num / 1000000)).append(" Million ").append(helper(num % 1000000));
    else
      s.append(helper(num / 1000000000)).append(" Billion ").append(helper(num % 1000000000));

    return s.toString().trim();
  }
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        int number;
        System.out.println("Enter the number to convert");
        number= sc.nextInt();
        String word= numberToWords(number);
        System.out.println("The Converted word of the number is: "+word);
    }
  }
}
