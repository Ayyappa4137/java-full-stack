class A1{

    void demo() {
        System.out.println("parent class");
    }
}
class b1 extends A1 {
    void demo()
    {
        System.out.println("parent class");
    }
    void demo1() {
        System.out.println("child2 class");
    }
}
class c1 extends b1 {
    void demo() {
        System.out.println("parent class");
    }
    void demo2() {
        System.out.println("extra child class");
    }
}
public class hierchy1 {
    public static void main(String[] args)
    {
        b1 obj3=new b1();
        obj3.demo();
        obj3.demo1();
        c1 obj1=new c1();
        obj1.demo();
        obj1.demo2();

    }
}

