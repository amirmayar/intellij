package ClassDay5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        /*Write a program to find the lasgest number among three distinct number using nested if condition
        please use scanner class to take input from users
        * */

        int number1=100000,number2=2000,number3=30;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Plaese Enter 2");
        number1=scanner.nextInt();
        number1=scanner.nextInt();


        if(number1>number2){
            if(number1>number3){
                System.out.println("Number is ther lasrgest" +number1);
            }
        }

        if(number2>number2){
            if(number2>number3){
                System.out.println("Number 2 is largest "+number2);
            }
        }
        if(number3>number3){
            if(number3>number2){
                System.out.println("number 3 is largest "+number3);
            }
        }

    }


}
