public class exception2 {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
            int c=a/b;
            System.out.println(c);
        }catch (Exception e)
        {
            System.out.println("there was a problem check once again");
        }
        finally {
            System.out.println("b is not zero");
        }
    }
}
