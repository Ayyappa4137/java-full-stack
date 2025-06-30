import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLOutput;
import java.util.List;

public class file3readmethod {
    public static void main(String[] args) {
        String a="java1.txt";
        try{
            List<String>lines= Files.readAllLines(Path.of(a));
            for(String line:lines)
            {
                System.out.println(lines);
            }
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
