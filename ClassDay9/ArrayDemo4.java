package ClassDay9;

public class ArrayDemo4 {
    public static void main(String[] args) {
        // Create an empty array then store 45 44 33 20 and 10 in it the use a loop
        // to add all the elements  which are present in the even indexes and print it after adding them
        // create an array and store 10,30,30,4,5,6,7,80
        // add all the element which are multiples of 2

        int [] numbers= new int[5];
        numbers[0]=45;
        numbers[1]=44;
        numbers[2]=33;
        numbers[3]=20;
        numbers[4]=10;
        // numbers[5]=50; error out of bounds

        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            if(i%2==0){
                sum=sum+numbers[i];
            }

        }
        System.out.println(sum);


            }


        }


