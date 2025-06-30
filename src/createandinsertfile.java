import java.io.File;
import java.io.FileWriter;

public class createandinsertfile {
        public static void main(String[] args) throws Exception {
            String a="java1";
            File file=new File(a);
            if (file.createNewFile())
            {
                System.out.println("file created");
            }
            else
            {
                System.out.println("try again");
            }
            File file1=new File(a);
            FileWriter writer=new FileWriter(file1);
            writer.write("TATA STRIVE");
            writer.write("bangalore");
            System.out.println("data inserted");
            writer.close();
        }
}


