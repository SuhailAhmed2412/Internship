class Q16
{
    public void m1 (int i,float f)
    {
        System.out.println(" int float method");
    }
    public void m1(float f,int i);
    {
        System.out.println("float int method");
    }
    public static void main(String[]args)
    {
        Q16 s=new Q16();
        s.m1(20,20);
    }
}
