interface ss{
    void demo1(int a);

    }

public class lambada1 {
    public static void main(String[] args) {
        ss obj= (a) ->System.out.println("hello world"+  "  "+a);
        obj.demo1(3);
    }
}
