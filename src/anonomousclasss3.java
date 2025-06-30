abstract class student66
{
    public abstract void stud44(String studname1, String Stdbranch);
}
   abstract class Employee77
   {
       public abstract void Emp55(String Ename, String EmpRole);
   }

public class anonomousclasss3 {
    public static void main(String[] args)
    {
        student66 obj= new student66()
        {
            public void stud44(String studname1, String Stdbranch)
            {
                System.out.println(studname1 + "\n" + Stdbranch);
            }
        };

            Employee77 obj1=new Employee77() {

            public void Emp55(String Ename,String EmpRole)
            {
                System.out.println(Ename+"\n"+EmpRole);
            }
        };
        obj.stud44("kumar","full stack");
        obj1.Emp55("ajay","HR");

    }
}






