public class Q9 {
    Q9() {
        System.out.println("Constructor Called");
    }
    static Q9 a = new Q9(); //line 8
    public static void main(String[] args) {
        Q9 b;
        b= new Q9();
    }
}
