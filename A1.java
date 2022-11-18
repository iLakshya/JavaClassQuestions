public class A1
{
    A1()
    {
        System.out.println("Hello a");
    }
    A1(int x)
    {
        this();
        System.out.println(x);
    }
}
class TestThis5
{
    public static void main(String args[])
    {
        A1 obj = new A1(10);
    }
}
