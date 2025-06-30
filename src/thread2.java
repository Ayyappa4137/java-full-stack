class A231 extends Thread {

    public void run() {  // Override run() instead of using red()
        for (int i = 0; i < 2; i++) {
            System.out.println("red STOP ");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class B231 extends Thread {
    @Override
    public void run() {  // Override run() instead of using yellow()
        for (int i = 0; i < 2; i++) {
            System.out.println("yellow get ready to go");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class C231 extends Thread {  // Standalone class (not nested)
    @Override
    public void run() {  // Override run() instead of using green()
        for (int i = 0; i <2; i++) {
            System.out.println("GREEN you can go");
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

 class Thread2 {
    public static void main(String[] args) {
        Thread obj1 = new A231();
        Thread obj2 = new B231();
        Thread obj3 = new C231();  // Now works (no nesting)
        obj1.start();
        obj2.start();
        obj3.start();
    }
}