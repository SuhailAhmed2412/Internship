final class A
{
    int i;
}

class B extends A
{
    int j;
    System.out.println(j + " " + i);
}

public class inheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}
