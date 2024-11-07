package SearchInsert;

public class SearchInsertMain {

    public static void main(String[] args) {

        System.out.println(searchInsert(new int[] {1,3,5,6}, 5));
        System.out.println(searchInsert(new int[] {1,3,5,6}, 2));
        System.out.println(searchInsert(new int[] {1,3,5,6}, 7));

    }

    public static int searchInsert(int[] nums, int target) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                index = i;
                return i;
            } else if(i != nums.length - 1) {

                if (nums[i] < target && nums[i + 1] > target) {
                    index = i + 1;
                    return i + 1;
                } else if (nums[i] > target) {
                    index = i;
                    return i;
                }

            } else {

                if (nums[i] < target) {
                index = nums.length;
                return nums.length;
                } else {
                    index = i;
                    return i;
                }
            }
        }

        return index;
    }
}
