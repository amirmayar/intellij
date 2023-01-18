package ClassDay3;

public class RelationalOperator {


    /*
    arithmetic operators
    int+




    Relational Operator
    >
    =>
    !=
    <
    =<
     */
    public static void main(String[] args) {
        int number=10;
        int number2=20;
        System.out.println(number+number2);
        boolean result=20>10;
        System.out.println(result);
        /*
        == equal to
        != not equal to
        > greater to
        < not greater then
        >= greater or equal
        <= less or equal

         */

        System.out.println(20>10);// we asked the computer is 20 greater the 10= True
        System.out.println(5>10);// is 5 greater then 10=flase
        System.out.println(5!=10);//is 5 not equal to 10
        System.out.println(5==10);//is 5 equal to 10
        System.out.println(5==5);//is 5 equal to 5 = true
        System.out.println(10<=20);// if we have two signs java will look for any true answer out of the two
        

    }
}
