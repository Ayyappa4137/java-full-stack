class outter
{
    void display() {
        class inner {
            void show22(String empname, String empid) {
                System.out.println(empname + "\n" + empid);
            }
        }
        inner obj = new inner();
        obj.show22("Ajay", "HR586");
    }

    }

public class nonstatic1 {
    public static void main(String[] args){
        outter obj=new outter();
        obj.display();
    }
}
