package RemoveDuplicatesFromSortedArray;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArrayMain {
    public static void main(String[] args) {
        removeDuplicates(new int[] {1,1,2});
        System.out.println("------------------");
        removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4});
        System.out.println("------------------");
    }

    public static int removeDuplicates(int[] nums) {

        int k = 0;
        int counter = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1]) {
                nums[i] = 0;
                counter++;
            }
        }

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));
        k = nums.length - counter;
        System.out.println(k);

        return k;
    }
}
