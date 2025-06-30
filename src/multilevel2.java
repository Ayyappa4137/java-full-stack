class animal3
{
    String color;
    String type;

    animal3(String color, String type) {
        this.color = color;
        this.type = type;
    }

    void dogdetails() {
        System.out.println(color + " " + type);
    }
}
class dog1 extends animal3 {
    String haircolor;

    dog1(String color, String type, String haircolor) {
        super(color, type);
        this.haircolor = haircolor;
    }

    void dogdetails() {
        System.out.println(color + " " + type + "  " + haircolor);
    }
}
    class babydog extends dog1 {
        String gender;
        babydog(String color, String type, String haircolor,String gender) {
            super(color, type, haircolor);
            this.gender = gender;
        }

        void dogdetails() {
            System.out.println(color + " \n" + type + " \n " + haircolor + " \n" + gender);
        }

    }
    public class multilevel2 {
        public static void main(String[] args) {
            babydog obj2 = new babydog("black","Carnivorous","brown","male");
            obj2.dogdetails();
        }
    }













