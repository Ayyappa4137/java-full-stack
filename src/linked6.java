import java.util.LinkedList;
import java.util.List;


public class linked6 {
        public static void main(String[] args) {
            List<String> car=new LinkedList<>();
            car.add("CaR REG NO KA06AB6666");
            car.add("red ");
            car.add("brezza");
            car.addLast("1700000");
            car.addLast("1200000");
            System.out.println(car);
            car.add(2,"POLO GT");
            System.out.println(car);
            car.set(1,"BLACK");
            System.out.println(car.size());
            System.out.println(car.get(3));
            car.remove(3);
            car.remove(4);
            car.remove(2);
            car.add(2,"THAR");
            System.out.println(car);
            car.remove(3);
            //car.add(3,"1200000");
            car.set(1,"RED");
            car.remove(2);
            car.add(2,"POLO GT");
            car.remove(0);
            car.add(0,"CAR REG NO KA07 AB 7777");
            car.addLast("1200000");

            System.out.println( car);
           System.out.println(car.contains("swift"));

        }
   }

