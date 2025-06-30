import java.io.FileReader;

public class readfilefis2 {
    public static void main(String[] args) {
        String a="image/avengers.jpg";
        try(FileReader reader=new FileReader(a))
        {
            int Character;
            while((Character=reader.read())!=-1)
            {
                System.out.println(Character);
            }
        }catch (Exception e)
        {
            System.out.println(e);
        }

    }
}

