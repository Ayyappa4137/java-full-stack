class student
{
    private int id=17;
    public String name="AYYAPPA";


    void displaydetails()
    {
        System.out.println("student name"+" "+name+"\n"+ "stud id "+" "+id);
    }
}

class construct5{
    public static void main(String[] args){

        student obj=new student();
        obj.displaydetails();
    }

}























