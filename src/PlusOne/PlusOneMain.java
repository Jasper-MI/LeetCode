package PlusOne;

import java.util.Arrays;

public class PlusOneMain {
    public static void main(String[] args) {
        plusOne_3(new int[]{9,9,9});
        System.out.println();
        System.out.println("---------------------");
        plusOne_3(new int[]{1,2,9});
        System.out.println("---------------------");
        plusOne_3(new int[]{8,8,9,9});
    }

    //Third Attempt
    public static int[] plusOne_3(int[] digits) {
        int counter = digits.length - 1;

        if(digits[digits.length-1] == 9) { //if the last digit is a 9, iterate throw the array
            for (int i = digits.length - 1; i >= 0 ; i--) {
                if (digits[i] == 9 && i == counter) { //if the digit is a 9 go normally to 'else'
                    if(i == 0) { //if the digit is the first number, the array has to expand
                        int[] newArray = new int[digits.length + 1];
                        System.arraycopy(digits, 0, newArray, 1, digits.length);
                        digits = newArray;
                        digits[i + 1] = 0;
                        digits[i] = digits[i] + 1;
                    } else {
                        digits[i] = 0;
                        if (digits[i - 1] == 9) { //the next digit is a 9, continue
                            counter--;
                            continue;
                        } else {
                            digits[i - 1] = digits[i - 1] + 1;
                            counter--;
                        }
                    }
                }
                counter--;
            }
        } else {
            digits[digits.length-1] = digits[digits.length-1] + 1;
        }
        System.out.println(Arrays.toString(digits));
        return digits;

    }

    //Second Attempt
    public static int[] plusOne_2(int[] digits) {
        int lastRound = 0; //increments when the last digit is a 9

        for (int i = 0; i < digits.length; i++) { //interates over the array
            if(i == digits.length - 1){ // if it is the last digit

                if(lastRound == 1) {
                    break;
                }else if (digits[i] == 9) { //if the last digit is a 9
                    digits[i] = 0;
                    digits[i - 1] = digits[i - 1] + 1;
                    i = 0;
                    lastRound = 1;
                } else { //for all last digits that are not a 9
                    digits[i] = digits[i] + 1;
                    break;
                }

            }

            if(digits[i] == 9) { //if the digit is a 9, it should be set 0 and the number before increments by 1. The loop starts again.
                if (i == 0) { //if the digit is the first in the array
                    int[] newArray = new int[digits.length + 1];
                    System.arraycopy(digits, 0, newArray, 1, digits.length);
                    digits = newArray;
                    System.out.println(Arrays.toString(digits));
                    digits[i + 1] = 0;
                    digits[i] = digits[i] + 1;
                    i = 0;
                } else {
                    digits[i] = 0;
                    digits[i - 1] = digits[i - 1] + 1;
                    i = 0;
                }


            }


        }
        System.out.println(Arrays.toString(digits));
        return digits;
    }

    //First Attempt
    public static int[] plusOne(int[] digits) {

        long number = 0;
        String numberString = "";


        for(int i = 0; i < digits.length; i++) {
            numberString = numberString + String.valueOf(digits[i]);
        }

        number = Long.parseLong(numberString);
        number++;
        numberString = String.valueOf(number);
        int[] newArray = new int[numberString.length()];

        for(int i = 0; i < numberString.length(); i++) {
            newArray[i] = Character.getNumericValue(numberString.charAt(i));
            System.out.print(newArray[i] + " ");
        }

        return newArray;
    }
}