public class Palindrome {


    public static void main(String[] args) {


        System.out.println("Hello World !");

        palindrome("küçük");

    }


    public static void palindrome(String s){

        String checkString = "";

        for(int i = s.length()-1; i>=0; i--) {

            checkString = checkString + s.charAt(i);
        }
        if(s.equals(checkString)){
           // return true;
            System.out.println("Yes");
        }
        else{
            //return false;
            System.out.println("No");

        }





    }





}
