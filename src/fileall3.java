import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;


public class fileall3 {
    public static void main(String[] args) throws Exception {
        File a = new File("java7.txt");
        try {
            if (a.createNewFile()) {
                System.out.println("file created");
            } else {
                System.out.println("File alredy exists");
            }
            FileWriter writer = new FileWriter((a));
            writer.write("hello TATA Strive");
            writer.write("Bangalore");
            System.out.println("file created");
            writer.close();

            FileReader reader = new FileReader(a);
            {
                int data = reader.read();
                while (data != 1) {
                    System.out.println((char) data);
                    data = reader.read();
                    while (data != 1) {
                        System.out.println((char) data);
                        data = reader.read();
                    }
                    reader.close();
                }
            }
            System.out.println();
            if (a.exists()) {
                if (a.delete()) {
                    System.out.println("file deleted");
                }
            }


        }
        catch (Exception e)
        {
            System.out.println();
        }



    }
}