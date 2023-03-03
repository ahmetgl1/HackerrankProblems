/*
Created by Ahmet Fatih Güzeller

Date  : 03.03.2023

Problem :
 Given an int array, return a new array with double the length where its last element
  is the same as the original array, and all the other elements are 0.
  The original array will be length 1 or more. Note: by default, a new int array contains all 0's.

nums({4, 5, 6}) → {0, 0, 0, 0, 0, 6}



 */

public class MakeLast {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};
        int[] nums2 = {6,2,3,4,3};
        int[] nums3 = {0,2,3,4,6};
        makeNewArray(nums);


    }
    public static void makeNewArray(int[] nums){

        int[] newArray = new int[nums.length *2];

        newArray[newArray.length-1] = nums[nums.length-1];

        for (int i =0; i<newArray.length; i++) {
            System.out.print(newArray[i]);
        }






}




    }
