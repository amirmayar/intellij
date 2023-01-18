package ClassDay5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        /*
        Scanner => Name of the class
        Scan is jus a like we create primitive variables
        = => assignment operator
        system.in=> tells the computer we want to read the date from the keyboard
        opersite of the system.out it take in input rather the out.

         */

      /*  System.out.println("Please Enter Your age");
        int age=scan.nextInt();
        System.out.println("Your are "+age+" years old ");
        System.out.println("plese Enter your weight");
        double weight=scan.nextDouble();
        System.out.println("Please Enter your "  +weight+ "Kgs");
        boolean hungry= scan.nextBoolean();
        System.out.println("hungry" +hungry);*/

        System.out.println("Please Enter Your Gender");
        char gender=scan.next().charAt(0);
        System.out.println("Your gender is "+gender);
        System.out.println("please Enter Your Name");
        String name=scan.next();
        System.out.println("your name is " +name);


        scan.nextLine();// Trick to make nextline method working after used any other medthod from scanner class//
        System.out.println("Please Enter full name ");
        String fullname=scan.nextLine();
        System.out.println("your Full name is "+fullname);
        scan.close();// good practice to close a scanner before you create a new scanner




    }

}
