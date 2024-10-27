package PalindromeNumber;

public class PalindromeNumberMain {
    public static void main(String[] args) {
        System.out.println(isPalindrome(707));

    }

    public static boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }

        String number = Integer.toString(x);
        char[] array = number.toCharArray();

        for (int i = 0; i < array.length / 2; i++) {
            if(array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
