class Derived
{
    public void getDetails()
    {
        System.out.printf("Derived class ");
    }
}

public class Q13 extends Derived {
    public void getDetails()
    {
        System.out.printf("Test class ");
        super.getDetails();
    }
    public static void main(String[] args) {
        Derived obj = new Q13();
        obj.getDetails();
    }
}
