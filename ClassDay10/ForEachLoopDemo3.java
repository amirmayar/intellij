package ClassDay10;

public class ForEachLoopDemo3 {
    public static void main(String[] args) {
        int [] arr={10,13,20,25,45,50};
        // we cant update the elements for each loop beacsue we don,t have access to the index.

        for(int x:arr){
            if(x%2!=0){
                x=0;
            }
        }
    }
}
