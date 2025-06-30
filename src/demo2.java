import java.io.File;

public class demo2 {
    public static void main(String[] args) throws Exception {
        String a="abc2.txt";
        File file=new File(a);
        if (file.createNewFile())
        {
            System.out.println("file created");
        }
        else{
            System.out.println("try again");
        }

    }
}
