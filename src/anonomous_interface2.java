interface Stud789 {
    public void  Stud789(String Std_name, String Stdbranch);
}
interface emp987{
    public void Emp345(String Emp_name,String Emprole);

}
public class anonomous_interface2 {
    public static void main(String[] args)
    {
        Stud789 obj1=new Stud789() {
            @Override
            public void  Stud789(String Std_name, String Stdbranch) {

                System.out.println(Std_name + "\n" + Stdbranch);
            }
        };
        emp987 obj2=new emp987()
        {
            public void emp987(String Emp_name, String Emprole) {

            }

            public void Emp345(String Emp_name, String Emprole) {
                System.out.println(Emp_name+"\n"+Emprole);
            }
        };
        obj2.Emp345("raghu","Manager");
        obj1. Stud789("ajay","java");
    }
}
















