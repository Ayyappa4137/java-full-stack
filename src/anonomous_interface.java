interface Stud_emp
{
    public void Stud333(String Std_name,String Stdbranch);
    public void Emp345(String Emp_name,String Emprole);

}
public class anonomous_interface {
    public static void main(String[] args)
    {
        Stud_emp obj1=new Stud_emp() {
            @Override
            public void Stud333(String Std_name, String Stdbranch) {

                System.out.println(Std_name+"\n"+Stdbranch);
            }

            @Override
            public void Emp345(String Emp_name, String Emprole) {
                System.out.println(Emp_name+"\n"+Emprole);
            }
        };
        obj1.Emp345("raghu","Manager");
        obj1.Stud333("ajay","java");
    }
}
