package ClassDay_4;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        //Below line help us get the input from the keyboard
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your name");
        String name=input.nextLine();
        System.out.println("My name is "+name);
    }
}
