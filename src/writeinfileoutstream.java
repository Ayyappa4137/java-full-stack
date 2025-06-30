import java.io.FileOutputStream;
import java.io.IOException;

public class writeinfileoutstream {
    public static void main(String[] args) {
        String a="abc2.csv";
        String content="Hello mary ,How is yadagiri";
        try
        {
            FileOutputStream fos=new FileOutputStream(a);
            byte[] bytes=content.getBytes();
            fos.write(bytes);
            System.out.println("data inserted");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
