public class FindIndex {
    public static void main(String[] args) {

        int[] numArray = {12,4,5,6};



        System.out.println( search(numArray , 3));

    }
    public static int search(int[] numArray , int number) {

        int i;
        for ( i = 0; i < numArray.length; i++) {

             if(numArray[i] == number){

                 return i;
             }
        }
        throw new RuntimeException("NOT FOUND !");

    }

}
