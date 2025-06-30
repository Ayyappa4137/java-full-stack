import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class con implements Consumer<Integer>           //functional interface
{
    public void accept(Integer i)
    {
        System.out.println(i);
    }
}
public class consumer1 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        Consumer<Integer> obj=new con();
        list.forEach(obj);
    }
}
