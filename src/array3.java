public class array3 {
    public static void main(String[] args)
    {
        int a[]={1,4,7,2,8,5,8};
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);

        }
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("sum of array elements:"+sum);
            }
}

//-->synatax
//data type araryname=values;
//data type array name=new datatype[];