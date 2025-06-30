class abc
{
    public void sum(int a,int b)
    {
        System.out.println("addition "+(a+b));
        System.out.println("sub "+(a-b));

    }
    public int sub(int a,int b)
    {
        return a-b;
    }
}

public class gurumethod
    {
        public static void main (String[] args)
        {
            abc obj = new abc();
            obj.sum(4, 1);
            obj.sub(4,1);

        }
    }

