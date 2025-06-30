import java.io.File;
import java.io.FileWriter;

public class writefile {
    public static void main(String[] args) throws Exception {
        String a="abc.txt";
        File file=new File(a);
        FileWriter writer=new FileWriter(file);
        writer.write("hello developers");
        writer.write("bangalore");
        System.out.println("data inserted");
        writer.close();
    }
}
