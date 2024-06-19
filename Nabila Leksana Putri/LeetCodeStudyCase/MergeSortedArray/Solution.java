package MergeSortedArray;

import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution mergeArray = new Solution(); // Create an object

        // Input panjang array nums1
        System.out.print("Masukkan panjang array nums1: ");
        int m = sc.nextInt();

        // Deklarasi dan inisialisasi array nums1
        int[] nums1 = new int[m];

        // Input elemen nums1
        System.out.println("Masukkan elemen nums1: ");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        // Input panjang array nums2
        System.out.print("Masukkan panjang array nums2: ");
        int n = sc.nextInt();

        // Deklarasi dan inisialisasi array nums2
        int[] nums2 = new int[n];

        // Input elemen nums2
        System.out.println("Masukkan elemen nums2: ");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i]);
        }
        System.out.println();
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i]);
        }

        mergeArray.merge(nums1, m, nums2, n);  // Call merge on the object

        // Print the merged array
        System.out.println("\nMerged array:");
        for (int i = 0; i < m + n; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Handle cases where m or n is 0 to avoid negative indexing
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
            return;
        }

        // Adjust initialization of k to stay within bounds
        int k = m + n - 1;

        // i points to the last element of nums1 filled with a valid value
        int i = m - 1;
        // j points to the last element of nums2
        int j = n - 1;

        // Iterate while there are elements in both arrays
        while (i >= 0 && j >= 0) {
            // If the element in nums1 is larger, place it in the merged array
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                // Otherwise, place the element from nums2 in the merged array
                nums1[k--] = nums2[j--];
            }
        }

        // Copy remaining elements from nums2 (if any)
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}