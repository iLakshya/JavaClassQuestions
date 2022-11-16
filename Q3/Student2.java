package Q3;
public class Student2
{
    String firstName, secondName;
    int age;
    Student2(String firstname, String secondname, int agee)
    {
        this.firstName = firstname;
        this.secondName = secondname;
        this.age = agee;
    }
    public static void main(String args[])
    {
        Student2 obj = new Student2("Aryann", "Chitnis", 20);
        System.out.println(obj.firstName);
        System.out.println(obj.secondName);
        System.out.println(obj.age);
    }
}
