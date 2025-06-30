class grandfather
{
     void grand()
    {
        System.out.println("grand father features");
    }
}
class parent2 extends grandfather
{
    void grand()
    {
        System.out.println("grand father features");
    }
     void parent1()
    {
        System.out.println("parent features");
    }
}
    class child1 extends parent
    {
        void grand()
        {
            System.out.println("grand father features");
        }
        void parent2()
        {
            System.out.println("parent features");
        }
         void hieght()
        {
            System.out.println("small");
        }

    }
    class multilevel1{
    public static void main(String []args){
        child1 obj=new child1();
        obj.grand();
        obj.parent2();
        obj.hieght();
    }
    }



