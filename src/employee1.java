class EMPLOYEE2
{
    String name ="Guru";
    int Emp_ID=18;
    double salary=98500;
}
class DEPARTMENT
{
    int Dep_id= 56;
    String Dep_name="HR";

}
public class employee1 {
    public static void main(String[] args)
    {
        EMPLOYEE2 obj=new EMPLOYEE2();
        System.out.println("EMPLOYEE name= "+obj.name);
        System.out.println("EMPLOYEE Emp_id= "+obj.Emp_ID);
        System.out.println("EMPLOYEE salary= "+obj.salary);
       DEPARTMENT obj1=new DEPARTMENT();
        System.out.println("DEPARTMENT Dep_id= "+obj1.Dep_id);
        System.out.println("dog color= "+obj1.Dep_name);

    }

}




