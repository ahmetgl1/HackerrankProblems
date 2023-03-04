
/*Problem:
Return the "centered" average of an array of ints, which we'll say is the mean average of the values,
 except ignoring the largest and smallest values in the array.
 If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value.
  Use int division to produce the final average. You may assume that the array is length 3 or more.

centeredAverage({1, 2, 3, 4, 100}) → 3
centeredAverage({1, 1, 5, 5, 10, 8, 7}) → 5
centeredAverage({-10, -4, -2, -4, -2, 0}) → -3

 */

public class AverageNumber {
    public static void main(String[] args) {

             int[] nums1 = {7,1,2,3,4};
             int[] nums2={2, 1, 2, 3, 4};
             int[] nums3={2, 2, 0};
             int[] nums4={1, 3, 5};

             System.out.print(average(nums1));
             System.out.print(average(nums2));
             System.out.print(average(nums3));
             System.out.print(average(nums4));



    }
    public static int average(int[] nums){

           int  min = nums[0];
           int  max = nums[0];
      int total = 0;


        for(int i = 0; i<nums.length; i++){

            total +=  nums[i];

             min = Math.min(min,nums[i]);
               max = Math.max(max, nums[i]);


        }
        total = (total -(min + max));

        return total / (nums.length -2);
        }

}
