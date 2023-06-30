class Derived
{
    public void getDetails(String temp)
    {
        System.out.println("Derived class " + temp);
    }
}

public class Q14 extends Derived{
    public int getDetails(String temp)
    {
        System.out.println("Test class " + temp);
        return 0;
    }
    public static void main(String[] args) {
        Q14 obj = new Q14();
        obj.getDetails("Name");
    }
}
