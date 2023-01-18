package ClassDay8;

import java.util.Scanner;

public class LoopWithString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please Enter Your Name ");
        while (scanner.next().equalsIgnoreCase("Sha")){
            System.out.println("As long as we see sha keep printing");

        }
    }
}
