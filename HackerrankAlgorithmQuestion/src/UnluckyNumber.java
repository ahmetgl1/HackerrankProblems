
/*Problem:
Return the sum of the numbers in the array, returning 0 for an empty array.
 Except the number 13 is very unlucky,
 so it does not count and numbers that come immediately after a 13 also do not count.

sum13({1, 2, 2, 1}) → 6
sum13({1, 1}) → 2
sum13({1, 2, 2, 1, 13}) → 6


 */

public class UnluckyNumber {
    public static void main(String[] args) {

        int[] nums1 = {7, 1, 2, 3, 4,13};
        int[] nums2 = {2, 1, 2, 13, 3, 4};
        int[] nums3 = {2, 2, 13,0};
        int[] nums4 = {13,1, 3, 5 ,13};
        int[] nums5 = {13};

        System.out.println(unluckNumber(nums1));
        System.out.println(unluckNumber(nums2));
        System.out.println(unluckNumber(nums3));
        System.out.println(unluckNumber(nums4));
        System.out.println(unluckNumber(nums5));


    }

    public static int unluckNumber(int[] nums) {

        int total = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 13) {

                total += nums[i];
            }
        }
        return total;
    }
}
