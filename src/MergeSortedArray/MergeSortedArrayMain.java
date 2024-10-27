package MergeSortedArray;

import java.util.Arrays;

public class MergeSortedArrayMain {
    public static void main(String[] args) {
        merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] tempArray = new int[nums1.length];

        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums1.length; j++) {
                if (nums1[j] < nums2[i]) {

                }
            }
        }


        nums1 = tempArray.clone();
        System.out.println(Arrays.toString(nums1));

    }
}
