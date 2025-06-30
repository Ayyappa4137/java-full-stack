import java.io.FileReader;



public class readfile1 {
    public static void main(String[] args)throws Exception {
        String a="image/img1.jpg";
        try(FileReader reader=new FileReader(a))
        {
            int Character;
            while((Character=reader.read())!=-1)
            {
                System.out.print((char)Character);
            }
        }catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
