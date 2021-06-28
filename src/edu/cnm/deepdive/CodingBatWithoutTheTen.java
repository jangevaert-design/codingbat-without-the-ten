package edu.cnm.deepdive;

/*

Return a version of the given array where all the 10's have been removed.
The remaining elements should shift left towards the start of the array as needed,
and the empty spaces a the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}.
You may modify and return the given array or make a new array.

withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
withoutTen([10, 2, 10]) → [2, 0, 0]
withoutTen([1, 99, 10]) → [1, 99, 0]
 */

import java.util.Arrays;

public class CodingBatWithoutTheTen {

  public static void main(String[] args) {
    System.out.println("Given the array [1, 10, 10, 2], the outcome is "
        + Arrays.toString(withoutTen(new int[] {1, 10, 10, 2})));
    System.out.println("Given the array [10, 2, 10], the outcome is "
        + Arrays.toString(withoutTen(new int[] {10, 2, 10})));
    System.out.println("Given the array [1, 99, 10], the outcome is "
        + Arrays.toString(withoutTen(new int[] {1, 99, 10})));
  }

  public static int[] withoutTen(int[] nums) {
    int[] result = new int[nums.length];
    int count = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 10) {
        result[count++] = nums[i];
      }
    }
    return result;
  }

}