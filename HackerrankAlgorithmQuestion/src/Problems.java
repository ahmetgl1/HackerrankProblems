package problems;


/*
                    PROBLEM :

We say that a string contains the word hackerrank if a subsequence of its characters spell the word hackerrank. Remeber that a subsequence maintains the order of characters selected from a sequence.

More formally, let  be the respective indices of h, a, c, k, e, r, r, a, n, k in string . If  is true, then  contains hackerrank.

For each query, print YES on a new line if the string contains hackerrank, otherwise, print NO.

Example

This contains a subsequence of all of the characters in the proper order. Answer YES


This is missing the second 'r'. Answer NO.


There is no 'c' after the first occurrence of an 'a', so answer NO.

Function Description

Complete the hackerrankInString function in the editor below.

hackerrankInString has the following parameter(s):


 */

public class Problems {
    public static void main(String[] args) {



        hackerrankInString("hackerrank"); //YES
        hackerrankInString("rankhacker"); //NO

    }

    public static void hackerrankInString(String s) {


        String checkString = "hackerrank";
        int checkIndex = 0;

        for(int i = 0; i<s.length(); i++){

            if(s.charAt(i) == checkString.charAt(checkIndex)){

                checkIndex++;
            }

        }
        if(checkIndex == checkString.length()){

            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }


    }


}
