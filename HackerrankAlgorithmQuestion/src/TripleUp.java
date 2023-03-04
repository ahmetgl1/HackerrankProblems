
/*Problem:

Return true if the array contains, somewhere,
 three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.

tripleUp({1, 4, 5, 6, 2}) → true
tripleUp({1, 2, 3}) → true
tripleUp({1, 2, 4}) → false


 */

public class TripleUp {
    public static void main(String[] args) {

      int[] nums1 = {47, 1, 2, 3, 5, 98};
      int[] nums2 = {120, 4,4,4, 5, 76, 1, 3};
      int[] nums3 = {1, 1, 4, 5,6};

      System.out.println(triple(nums2));
      System.out.println(triple(nums3));

    }


    public static boolean triple(int[] nums){


        for(int i = 0; i<nums.length-2; i++){

            if(nums[i]+1 ==nums[i+1] && nums[i+1]+1 ==nums[i+2]){

             return true;
            }
            }
        return false;
        }











    }
