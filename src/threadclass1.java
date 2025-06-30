

    class A23 extends Thread {
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("java developer");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }

            }

        }
    }

    class B23 extends Thread{
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("react developer");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }

            }

        }
    }
    public class threadclass1 {
    public static void main(String[] args) {
            Thread obj1 = new A23();
            Thread obj2 = new B23();
            obj1.start();
            obj2.start();
        }
}