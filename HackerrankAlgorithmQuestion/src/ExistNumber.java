
/*Problem:

Given an array of ints, return true if the number of 1's is greater than the number of 4's

more14({1, 4, 1}) → true
more14({1, 4, 1, 4}) → false
more14({1, 1}) → true


 */

public class ExistNumber {
    public static void main(String[] args) {

        int[] nums1 = {47, 1, 2, 2, 5, 98};
        int[] nums2 = {120, 4,4,4, 5, 76, 1, 3};
        int[] nums3 = {1, 1, 4, 4};




     number(nums1);
     number(nums2);
     number(nums3);

    }


    public static void number(int[] nums){



        int count1 = 0;
        int count4 = 0;

        for(int i = 0; i<nums.length; i++){

            if(nums[i] ==1){
                count1++;
            } else if (nums[i] ==4) {
                count4++;
            }
        }
        if(count1 > count4){
            System.out.println("True");
        } else if (count1 < count4) {
            System.out.println("False");
        }
        else {
            System.out.println("Equals");

        }

        }


    }
