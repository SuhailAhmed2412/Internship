public class Q25 {
    int a = 1;
    int b = 2;
    Q25 func(Q25 obj)
    {
        Q25 obj3 = new Q25();
        obj3 = obj;
        obj3.a = obj.a++ + ++obj.b;
        obj.b = obj.b;
        return obj3;
    }
    public static void main(String[] args) {
        Q25 obj1 = new Q25();
        Q25 obj2 = obj1.func(obj1);
        System.out.println("obj1.a = " + obj1.a + " obj1.b = " + obj1.b);
        System.out.println("obj2.a = " + obj2.a + " obj1.b = " + obj2.b);
    }
}
