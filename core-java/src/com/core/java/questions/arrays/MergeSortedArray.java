/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 *
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 *
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1. 
 * To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 *
 * Example 1:
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 * 
 */
package com.core.java.questions.arrays;

import java.util.Arrays;

/**
 * 
 * @author sarvesh.lakhera
 *
 */
public class MergeSortedArray {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    for (int i = 0; i < n; i++) {
      nums1[m + i] = nums2[i];
    }
    Arrays.sort(nums1);
    Arrays.stream(nums1).forEach(element -> {
      System.out.println(element);
    });
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3, 0, 0, 0 };
    int[] arr2 = { 2, 5, 6 };
    MergeSortedArray mergeSortedArray = new MergeSortedArray();
    mergeSortedArray.merge(arr1, 3, arr2, 3);
  }
}
