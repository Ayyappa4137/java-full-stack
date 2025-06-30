class chatuser extends Thread{
 String user;
    String person1;
    String[] message;
   chatuser(String user, String[] message)
  {
      this.user=user;
      this.message=message;
  }
  public void run(){
      for(String msg:message){
          System.out.println(person1+":"+msg);
          try {
              Thread.sleep(2000);
          }catch (Exception e){
              System.out.println();
              }
          }
      }
  }
public class conversationuser {
    public static void main(String[] args) {
        String[] user1msg={"hai","how are you","where r u"};
        String[] user2msg={"hello",""," i am fine","i live in bnglr"};
        Thread p1= new chatuser("ajay",user1msg);
        Thread p2= new chatuser("arun",user2msg);
        p1.start();
        p2.start();
    }
}
