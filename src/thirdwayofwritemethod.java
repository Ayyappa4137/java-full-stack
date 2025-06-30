import java.nio.file.Files;
import java.nio.file.Paths;


public class thirdwayofwritemethod {
        public static void main(String[] args)throws Exception {
            String a="abc1.pdf";
            String content=" mary is from yadgiri ";
            try{
                Files.write(Paths.get(a),content.getBytes());
                System.out.println("file created");
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }


