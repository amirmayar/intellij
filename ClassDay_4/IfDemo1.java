package ClassDay_4;

public class IfDemo1 {
    public static void main(String[] args) {
        int money = 15000;
        if (money > 1000) {
            System.out.println("lets buy an Iphone");
        }


        if (money > 2000) {
            System.out.println("Lets also buy a Macbook");
        }
        boolean morthersday = true;
        if (morthersday) {
            System.out.println("happy mothers day");
        }
        // eauals method is only for non-primitives
        String name = "Saradr";

        if (name.equals("Sardar")) {
            System.out.println("i love football");
        }

    }
}
