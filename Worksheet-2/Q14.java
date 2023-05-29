public class Q14 {
    static int start = 2;
    final int end;
    public Q14(int x) { //Replacing with program name
        x = 4;
        end = x;
    }
    public void fly(int distance) {
        System.out.println(end-start+" ");
        System.out.println(distance);
    }
    public static void main(String[] args) {
        new Q14(10).fly(5);
    }
}
