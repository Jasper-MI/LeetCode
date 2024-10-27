package JumpGame;

//Problem: https://leetcode.com/problems/jump-game/description/
// 153 / 173 testcases passed :(
public class JumpGameMain {
    public static void main(String[] args){
        System.out.println(canJump(new int[] {3,0,8,2,0,0,1})); //does not work
        System.out.println("------------");
        System.out.println(canJump(new int[] {3,1,0,3,1,0,0})); //does not work
        System.out.println("------------");
        System.out.println(canJump(new int[] {2,0,2}));
        System.out.println("------------");
        System.out.println(canJump(new int[] {1,0,1,1}));
        System.out.println("------------");
        System.out.println(canJump(new int[] {1,0,1,0}));
        System.out.println("------------");
        System.out.println(canJump(new int[] {2,0,0}));
        System.out.println("------------");
        System.out.println(canJump(new int[] {1,2,0,0}));
        System.out.println("------------");
        System.out.println(canJump(new int[] {2,3,1,1,4}));
        System.out.println("------------");
        System.out.println(canJump(new int[] {3,2,1,0,4}));
        System.out.println("------------");
        System.out.println(canJump(new int[] {1,1,1,3,4}));
        System.out.println("------------");
        System.out.println(canJump(new int[] {2,5,0,0}));
        System.out.println("------------");
        System.out.println(canJump(new int[] {0}));
        System.out.println("------------");
    }

    public static boolean canJump(int[] nums) {

        int arrayIndex = 0;

        if (nums.length <= 1) {
            return true;
        }

        for (int i = 1; i <= nums[arrayIndex]; i++) {
            try {
                if (arrayIndex + i == nums.length - 1) {
                    return true;
                } else if (nums[arrayIndex + i] != 0 ) {
                    arrayIndex += i; //select next item in array
                    i = 0; //reset for-loop
                }
            } catch (ArrayIndexOutOfBoundsException e) { //if you jumped out of bounds, you can hit the target -> return true;
                return true;
            }
        }

        return false;

    }
}
