package ReverseInteger;

//Problem: https://leetcode.com/problems/reverse-integer/description/
public class ReverseIntegerMain {

    public static void main(String[] args) {
        System.out.println(solution(123));
        System.out.println("--------------");
        System.out.println(solution(-123));
        System.out.println("--------------");
        System.out.println(solution(120));
        System.out.println("--------------");
    }

    public static int solution(int x) {

        String numberString = Integer.toString(x);
        int negativeMarker = 0;

        if(numberString.charAt(0) == '-') {
            numberString = numberString.substring(1);
            negativeMarker = 1;
        }

        char[] numberArray = new char[numberString.length()];
        char[] newNumberArray = new char[numberArray.length];

        //fill numberArray with the numbers of x
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = numberString.charAt(i);
        }

        //copy the array in a new array the reverse order
        for (int i = numberArray.length - 1; i >= 0; i--) {
            newNumberArray[numberArray.length - i - 1] = numberArray[i];
        }

        String stringResult = new String(newNumberArray);

        if (negativeMarker == 1) {
            stringResult = "-" + stringResult;
        }

        int result;
        try {
            result = Integer.parseInt(stringResult);
        } catch (NumberFormatException e) {
            return 0;
        }

        return result;
    }

}
