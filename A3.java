class A2
{  
    int rollno;  
    String name;  
    float fee;  
    A2(int rollno, String name, float fee)
    {
        this.rollno = rollno;  
        this.name = name;  
        this.fee = fee;  
    }  
    void display()
    {
        System.out.println(rollno+" "+name+" "+fee);
    }
}  
class TestThis2
{
    public static void main(String args[])
    {  
        A2 s1 = new A2(111,"ankit",5000f);  
        A2 s2 = new A2(112,"sumit",6000f);  
        s1.display();  
        s2.display();
    }
}