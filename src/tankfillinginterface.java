

    class FillWaterTank10To30 implements Runnable {
        public void run() {
            for (int percent = 10; percent < 50; percent++) {
                System.out.println("Tank A filling: " + percent + "%");
                try {
                    System.out.println("waiting");
                    Thread.sleep(500); // 0.5 second delay between each percentage
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            System.out.println("Tank A reached 50%!");
        }
    }



    public class tankfillinginterface {
        public static void main(String[] args) {
            // Create Runnable instances
            Runnable tankA = new FillWaterTank10To30();
            //Runnable tankB = new FillWaterTank30To50();

            // Create Threads
            Thread threadA = new Thread(tankA);
           // Thread threadB = new Thread(tankB);

            // Start both filling processes
            threadA.start();
            //threadB.start();

            try {
                // Wait for both threads to complete
                threadA.join();
                //threadB.join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println("water tank completed filling!");
        }
    }
