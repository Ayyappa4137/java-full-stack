public class car2 {
    int a;
    int b;


    car2(int A, int B) {
        a = A;
        b = B;

    }

    // Method
    void displayInfo() {
        System.out.println("sum: " + (a+b));

    }
}
 class suni {
    public static void main(String[] args) {
        car2 obj = new car2(10, 15);
        obj.displayInfo();
    }
}














