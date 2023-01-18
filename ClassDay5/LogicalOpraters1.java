package ClassDay5;

public class LogicalOpraters1 {
    public static void main(String[] args) {




        boolean boughtCho=false;
        boolean boughtFlowers=false;


        boolean wifi=true;
        boolean fiveG=false;

        if(wifi|fiveG){
            System.out.println("you are good for browsing the intrnet");

        }else{
            System.out.println("Either connect to wifi or to 5G ");
        }
    }
}
