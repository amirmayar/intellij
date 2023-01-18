package ClassDay3;

public class IfElse_9 {
    public static void main(String[] args) {

        char c='M';
        if (c=='M'){
            System.out.println("Male");
        }

        String Name="Nat";
        // with non-primaitive data such as sting we cannot use == symbol

        if(!Name.equals("Sam")){
            System.out.println("Amazing Student ");

        // ! symbol can change ture to false
        }
        if(!Name.equals("Sam")){
            System.out.println("super Amazing Student");
        }
    }
}
