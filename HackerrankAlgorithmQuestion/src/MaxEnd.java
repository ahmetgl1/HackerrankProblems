public class MaxEnd {

    /*
    Given an array of ints length 3, figure out which is larger , the first or last element in the array
    , and set all the other elements to be that value . Return the changed array.



     maxEnd([ 1, 2, 3])   -> [3, 3, 3]
     maxEnd([ 7, 8, 9])   -> [9, 9, 9]
     */


    int max;

    public int[] maxEnd(int[] nums){

     if(nums[0] > nums[nums.length -1]){

         nums[0] = max;
     }
     else{

         max = nums[nums.length -1];
     }

     nums[0] = max;
     nums[1] = max;
     nums[2] = max;


 return nums;
    }





}
