public class Q10 {
    static int num;
    static String mystr;
    // constructor
    Q10()
    {
        num = 100;
        mystr = "Constructor";
    }
    // First Static block
    static
    {
        System.out.println("Static Block 1");
        num = 68;
        mystr = "Block1";
    }
    // Second static block
    static
    {
        System.out.println("Static Block 2");
        num = 98;
        mystr = "Block2";
    }
    public static void main(String[] args) {
        Q10 a = new Q10();
        System.out.println("Value of num = " + a.num);
        System.out.println("Value of mystr = " + a.mystr);
    }
}
