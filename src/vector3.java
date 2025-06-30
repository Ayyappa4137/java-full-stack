import java.util.List;
import java.util.Vector;

public class vector3 {
        public static void main(String[] args) {
            List<String> clg=new Vector<>();

            clg.add("Angadi institute");
            clg.add("Belagavi");
            clg.add("MCA");
            System.out.println(clg);
            clg.add("CS");
            clg.add("MECH");
            clg.add("CIVIL");
            System.out.println(clg);
            System.out.println(clg.size());
            System.out.println(clg.get(3));
            System.out.println(clg);
            clg.remove(2);
            clg.add(5,"MBA");
            clg.add(6,"EEE");
            clg.add(7,"EC");
            System.out.println( clg);
            System.out.println(clg.contains("robotics"));

            clg.clear();
            System.out.println(clg);

        }
    }


