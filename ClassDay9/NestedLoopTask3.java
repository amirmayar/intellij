package ClassDay9;

import java.util.Scanner;

public class NestedLoopTask3 {
    public static void main(String[] args) {
        /*
        Write a program that reads a range of integers (start and end point)
 provided by a user and then from that range prints the sum of the even and odd integers.
        */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter two Numbers Starting point and ending point");
        int start=scanner.nextInt();
        int end=scanner.nextInt();
        int evensum=0;
        int oddsum=0;

        for (int i = start; i <=end ; i++) {
            System.out.println(i);
            if(i%2==0){
                evensum+=i;

            }else{
                oddsum=oddsum+i;

            }
            System.out.println("sum of all the even number "+evensum);
            System.out.println("sum of all the even number "+oddsum);

        }


    }
}
