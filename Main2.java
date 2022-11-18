import java.io.FileWriter;
public class Main2
{
    public static void main(String args[])
    {
        String data = "New data added";
        try
        {
            FileWriter output = new FileWriter("newFile.txt");
            output.write(data);
            System.out.println("Data is updated");
            output.close();
        }
        catch(Exception e)
        {
            e.getStackTrace();
        }
    }
}
