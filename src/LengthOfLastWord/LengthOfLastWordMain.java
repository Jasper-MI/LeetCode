package LengthOfLastWord;

//Problem: https://leetcode.com/problems/length-of-last-word/description/?envType=problem-list-v2&envId=r2xc7dc6
public class LengthOfLastWordMain {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println("---------------------");
        System.out.println(lengthOfLastWord(" fly me to the moon "));
        System.out.println("---------------------");
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
        System.out.println("---------------------");
    }

    public static int lengthOfLastWord(String s) {
        int result = 0;

        s = s.trim();

        char[] stringArray = s.toCharArray();

        for (int i = stringArray.length; i > 0; i--) {
            if (stringArray[i - 1] == ' ') {
                break;
            }
            result++;
        }

        System.out.println(stringArray);

        return result;

    }
}
