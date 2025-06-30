import java.io.File;

public class deletefile1 {
    public static void main(String[] args) {
        File file=new File("java5.txt");
        if (file.exists())
        {
            if(file.delete()){
                System.out.println("file deleted");
            }
            else{
                System.out.println("file not deleted or file not present");
            }
        }else {
            System.out.println("file doesn't exist");
        }
    }
}
