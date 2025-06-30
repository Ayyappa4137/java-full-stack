import java.io.FileOutputStream;
public class filesbinary {
    public static void main(String[] args) {
        try(FileOutputStream fos=new FileOutputStream("img.jpg"))
        {
            System.out.println("binary file created successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
