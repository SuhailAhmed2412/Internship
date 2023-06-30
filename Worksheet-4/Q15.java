class test {
    public static int y=0;
}
public class Q15 {
    public static int x=100;
    public static void main(String[] args) {
        Q15 hs1 = new Q15();
        hs1.x++;
        Q15 hs2 = new Q15();
        hs2.x++;
        hs1 = new Q15();
        hs1.x++;
        Q15.x++;
        System.out.println("Adding to 100, x = " + x);
        test t1 = new test();
        t1.y++;
        test t2 = new test();
        t2.y++;
        t1 = new test();
        t1.y++;
        System.out.print("Adding to 0, ");
        System.out.println("y = " + t1.y + " " + t2.y + " " + test.y);
    }
}
