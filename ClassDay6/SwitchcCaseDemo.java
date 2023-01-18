package ClassDay6;

import java.util.Scanner;

public class SwitchcCaseDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String country=scanner.next();
        System.out.println("whats is the favrite for of");

        System.out.println(country.toLowerCase());
        switch (country.toLowerCase()) { //converts the text to lowercase

            case "usa":
                System.out.println("burgers");
                break;
            case "itlay":
                System.out.println("pasta");
                break;
            case "afghanistan":
                System.out.println("kabab");

            default:
                System.out.println("worng country");


        }
    }
}
