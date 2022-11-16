package Q1;
class Student
{
    String name;
    Student(String s)
    {
        name = s;
    }
    Student()
    {
        name = "Unknown";
    }
}
class Ans
{
    public static void main(String args[])
    {
        Student obj1 = new Student("xyz");
        Student obj2 = new Student();
        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}
