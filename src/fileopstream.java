import java.io.FileOutputStream;
import java.io.IOException;

public class fileopstream {
    public static void main(String[] args) throws Exception{
        {
            String a="java2.csv";
            String content="Welcome to tata strive ";
            try
            {
                FileOutputStream fos=new FileOutputStream(a);
                System.out.println("file created successfully ");
                byte[] bytes=content.getBytes();
                fos.write(bytes);
                System.out.println("data inserted ");

            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
        }
