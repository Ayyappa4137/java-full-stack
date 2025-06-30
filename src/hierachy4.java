class college{
    String CN;
    String CADD;
    college(String College_name,String College_ADD)
    {
        this.CN=College_name;
        this.CADD=College_ADD;
    }
    void clgdetails(){
        System.out.println(CN+"\n"+CADD);
    }
}
class DEPT extends college{
    String DEPN;
    String TN;

    DEPT(String College_name,String College_ADD,String DEPN,String T_name)
    {
        super(College_name,College_ADD);
        this.TN=T_name;
        this.DEPN=DEPN;
    }
    void depdetails()
    {
        super.clgdetails();
        System.out.println(DEPN+"\n"+TN);
    }

}
class stud4 extends DEPT {
    String StudN;
    String Srollno;

    stud4(String College_name,String College_ADD, String TN, String DEPN,String sname,String sroll ) {
        super(College_name, College_ADD, TN, DEPN);
        this.StudN = sname;
        this.Srollno = sroll;
    }
    void clgdetails()
    {
        System.out.println(StudN+"\n" +Srollno+"\n"+TN);
    }

}

public class hierachy4 {
    public static void main(String[] args){
        DEPT obj=new DEPT("TATA Strive","bangalore","java","manju_sir");
        obj.depdetails();
        stud4 obj1=new stud4("tata Strive","bangalore","manjunath_sir","java","Ayyappa","J55");
        obj1.clgdetails();
    }
}






