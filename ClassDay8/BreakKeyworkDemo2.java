package ClassDay8;

public class BreakKeyworkDemo2 {
    public static void main(String[] args) {


        boolean summer=true;
        int temp=75;
        while (summer){
            if(temp<=100){
                System.out.println("I lover summer becsuse the temperature is  " +temp);

            }else {
                System.out.println("its very hot "+temp);
                break;
            }
            temp+=5;
        }
    }
}
