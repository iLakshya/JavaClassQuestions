import java.io.File;
public class Main3
{
    public static void main(String args[])
    {
        File file = new File("file.txt");
        boolean value = file.delete();
        if(value)
        {
            System.out.println("File is deleted");
        }
        else
        {
            System.out.println("File is not deleted");
        }
    }    
}
