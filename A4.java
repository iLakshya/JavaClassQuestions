class A4
{
    int rollno;  
    String name;  
    float fee;  
    A4(int r,String n,float f)
    {
        rollno = r;  
        name = n;  
        fee = f;  
    }  
    void display()
    {
        System.out.println(rollno+" "+name+" "+fee);
    }
}
class TestThis3
{
    public static void main(String args[])
    {
        A4 s1 = new A4(111,"ankit",5000f);  
        A4 s2 = new A4(112,"sumit",6000f);  
        s1.display();  
        s2.display();  
    }
}