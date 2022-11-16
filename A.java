public class A
{
    void m()
    {
        System.out.println("Hello m");
    }
    void n()
    {
        System.out.println("Hello n");
        this.m();
    }
}
class TestThis4
{
    public static void main(String args[])
    {
        A obj = new A();
        obj.n();
    }
}
