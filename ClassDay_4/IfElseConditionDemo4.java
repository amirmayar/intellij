package ClassDay_4;

public class IfElseConditionDemo4 {
    public static void main(String[] args) {
        int number1=10;
        int number2=10;
        /*
        if number1 is equal to number2 on the consloe=> are equal
        if number1>number=> number1 is greater then number2
        if number2>number1=number2 is greather then number2

         */
        if(number1==number2){
            System.out.println("are equel");

        }
        if(number1>number2){
            System.out.println("Number1 is greater then number2");
        }
        if(number2>number1){
            System.out.println("number2 is greater then number2");
        }else if(number1>number2){
            System.out.println("number1 is greater then number2");
        }
    }
}
