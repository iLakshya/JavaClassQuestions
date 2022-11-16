package Q3;
public class Student
{
    String firstName;
    String secondName;
    int age;
    Student()
    {
        firstName = "Lakshya";
        secondName = "Goel";
        age = 20;
    }
    public static void main(String[] args)
    {
        Student obj = new Student();
        System.out.println(obj.age);
    }
}
