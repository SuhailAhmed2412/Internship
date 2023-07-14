public class Q4 {
    int num = 100;
    public void calc(int num) { 
        this.num = num * 10; 
    }
    public void printNum() { 
        System.out.println(num); 
    }
    public static void main(String[] args) {
        Q4 obj = new Q4();
        obj.calc(2);
        obj.printNum();
    }
}
