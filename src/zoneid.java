import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.Month;


public class zoneid {
    public static void main(String[] args) {
        LocalDate d=LocalDate.of(2000,Month.JUNE,25);
        System.out.println(d);
        LocalTime t=LocalTime.now(ZoneId.of("Asia/Dubai"));
        System.out.println(t);
       // for (String i:ZoneId.getAvailableZoneIds()){
           // System.out.println(i);

       // }
    }
}
