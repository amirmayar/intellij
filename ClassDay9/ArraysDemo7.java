package ClassDay9;

public class ArraysDemo7 {
    public static void main(String[] args) {
        double [] arr={10.5,12,0,45,10.5,23,10.5};
        /*
        Write a program that can tell us how many times the 10.5
        is present in the Array
        */
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==10.5){
                count++;
            }
        }
        System.out.println(count);
    }
}
