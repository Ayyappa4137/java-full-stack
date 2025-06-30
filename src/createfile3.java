import java.nio.file.Files;
import java.nio.file.Paths;

public class createfile3 {
    public static void main(String[] args) {
        String a="java5.txt";
        try{
            Files.write(Paths.get(a),"Hello raj".getBytes());
            System.out.println("file created");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
