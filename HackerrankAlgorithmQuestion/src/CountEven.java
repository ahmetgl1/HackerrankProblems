
/*

Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

countEvens({2, 1, 2, 3, 4}) → 3
countEvens({2, 2, 0}) → 3
countEvens({1, 3, 5}) → 0
 */

public class CountEven {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4};

System.out.print(count(nums));

    }
    public static int count(int[] nums){

        int count = 0;
        for(int i = 0; i<nums.length; i++){

            if(i%2 ==0){
                count++;
            }

        }

        return count;
       //System.out.print("Sonuç : "+ count);
    }
}
