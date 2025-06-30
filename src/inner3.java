class outer122
{
    private class inner
    {

        void Emp(String name,int ID)
        {
            System.out.println(name+"\n"+ID);
        }

        void DEPT(String DEPNMAE,String DepID)
        {
            System.out.println(DEPNMAE+"\n"+DepID);
        }
    }
    void display()
    {
        inner obj2=new inner();
        obj2.Emp("Vishwa",24);

        obj2.DEPT("HR","HR155");
    }
}
 class inner23 {
    public static void main(String[] args)
    {
        outer122 obj1=new outer122();
        obj1.display();
    }
}















public class inner3 {
}
