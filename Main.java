import java.io.File;
public class Main
{
    public static void main(String args[])
    {
        File file = new File("newFile.txt");
        try
        {
            boolean value = file.createNewFile();
            if(value)
            {
                System.out.println("New file is created");
            }
            else
            {
                System.out.println("File already exists");
            }
        }
        catch(Exception e)
        {
            e.getStackTrace();
        }
    }
}
