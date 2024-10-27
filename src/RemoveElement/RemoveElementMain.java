package RemoveElement;

import java.util.Arrays;

public class RemoveElementMain {
    public static void main(String[] args) {
        removeElement(new int[]{3,2,2,3}, 3);

        System.out.println("-------------------");

        removeElement(new int[]{0,1,2,2,3,0,4,2}, 2);


    }

    public static int removeElement(int[] nums, int val) {
        int removedElements = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                continue;
            } else {
                nums[removedElements] = nums[i];
                removedElements++;
            }
        }
        System.out.println(removedElements);
        System.out.println(Arrays.toString(nums));
        return removedElements;
    }
}
