import java.nio.file.Files;
import java.nio.file.Paths;

public class file3write {
    public static void main(String[] args) throws Exception {
        String a = "java3.txt";
        String content = "Welcome to JAVA Class";
        try {
            Files.write(Paths.get(a),content.getBytes());
            System.out.println("File created successfully");
            Files.write(Paths.get(a), content.getBytes());
            System.out.println("File inserted successfully");
        } catch (Exception e) {

            System.out.println(e);

        }
    }
}

