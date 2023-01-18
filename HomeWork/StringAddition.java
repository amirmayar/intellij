package HomeWork;

import javax.lang.model.element.NestingKind;

public class StringAddition {
    public static void main(String[] args) {
        String firstName="Amir";
        String lastname="Mayar";
        String space=" ";

        /* java executes code from top to bottom but if we have multiple operatoin on the same lines it
        executes them from left to right
         */
        System.out.println(""+firstName+lastname);
        System.out.println("First Name is "+firstName);
        System.out.println(firstName+" "+lastname);
        System.out.println(firstName+space+lastname);
        /* you can use any class bolean or int etc

         */
    }
}
