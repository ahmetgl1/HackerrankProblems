import java.util.Arrays;

public class SumValue {
    public static void main(String[] args) {

        int[] array = {12,4,5,6};

        System.out.println(Arrays.toString(sum(array, 18)));

    }

    public static int[] sum(int[] arrays ,  int value){

        int[] newArray = new int[2];


        for(int i = 0; i< arrays.length; i++){

            for(int j = i+1; j< arrays.length; j++){


                if(arrays[i] + arrays[j] == value){

                     return new int[]{i , j};

                }
            }
        }
        return newArray;

    }

}
